package com.dummychess.piece;

import com.dummychess.board.*;
import com.dummychess.board.position.Coordinate;
import com.dummychess.board.position.CoordinateHelper;
import com.dummychess.board.position.RelativeCoordinate;
import com.dummychess.move.Move;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    protected Square currentSquare;
    protected Move[] traversePaths;
    protected Move[] pawnPaths;
    protected Color color;
    protected boolean hasMoved = false;

    protected Piece(Square square) {
        this.currentSquare = square;
        initializeTraversePaths();
        initializePawnPaths();
    }

    public boolean canSkip() {
        return false;
    }

    public void move(Coordinate coordinate) throws NoSuchSquareExistsException, InvalidMoveException {
        if (getValidTraversePaths().contains(coordinate) || getValidPawnPaths().contains(coordinate)) {
            this.currentSquare.clear();
            Square square = Board.getInstance().find(coordinate);
            this.currentSquare = square;
            this.currentSquare.putPiece(this);
            setHasMoved();
        } else {
            throw new InvalidMoveException();
        }
    }

    public List<Coordinate> getAllTraversePaths() {
        return getValidTraversePaths();
    }

    public List<Coordinate> getAllPawnPaths() {
        return getValidPawnPaths();
    }

    public List<Coordinate> getValidTraversePaths() {
        List<Coordinate> validPaths = new ArrayList<>();
        for (Move move : traversePaths) {
            for (RelativeCoordinate relativeCoordinate : move.getRelativeCoordinates()) {
                //Determine The Absolute Coordinate of a Relative Coordinate
                Coordinate absoluteCoordinate = CoordinateHelper.determine(currentSquare.getCoordinate(), relativeCoordinate);
                try {
                    //Determine the specific Square and check if empty
                    if (Board.getInstance().find(absoluteCoordinate).isEmpty()) {
                        //Add the square if unoccupied else skip
                        validPaths.add(absoluteCoordinate);
                    } else {
                        break;
                    }
                } catch (NoSuchSquareExistsException e) {
                    //If Square does not exist then skip
                    break;
                }
            }
        }
        return validPaths;
    }

    public List<Coordinate> getValidPawnPaths() {
         List<Coordinate> validPawns = new ArrayList<>();
        for (Move move : pawnPaths) {
            for (RelativeCoordinate relativeCoordinate : move.getRelativeCoordinates()) {
                //Determine The Absolute Coordinate of a Relative Coordinate
                Coordinate absoluteCoordinate = CoordinateHelper.determine(currentSquare.getCoordinate(), relativeCoordinate);
                try {
                    Square square = Board.getInstance().find(absoluteCoordinate);
                    //If square is occupied and the color is different consider it as enemy
                    if (!square.isEmpty() && square.getPiece().color.equals(this.color))
                        break;
                    else if (!square.isEmpty() && !square.getPiece().color.equals(this.color)) {
                        validPawns.add(absoluteCoordinate);
                        break;
                    }
                } catch (NoSuchSquareExistsException | NoPieceFoundException e) {
                    break;
                }
            }
        }
        return validPawns;
    }

    public Color getColor() {
        return color;
    }

    protected abstract void initializeTraversePaths();
    protected abstract void initializePawnPaths();

    private void setHasMoved() {
        if (hasMoved == false)
            this.hasMoved = true;
    }

}
