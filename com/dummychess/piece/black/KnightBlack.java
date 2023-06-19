package com.dummychess.piece.black;

import com.dummychess.board.Board;
import com.dummychess.board.NoPieceFoundException;
import com.dummychess.board.NoSuchSquareExistsException;
import com.dummychess.board.Square;
import com.dummychess.board.position.Coordinate;
import com.dummychess.board.position.CoordinateHelper;
import com.dummychess.board.position.RelativeCoordinate;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

import java.util.ArrayList;
import java.util.List;

public class KnightBlack extends Piece {

    public KnightBlack(Square square) {
        super(square);
        super.color = Color.BLACK;
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
                new ForwardL(),
                new BackwardL(),
                new RightL(),
                new LeftL()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new ForwardL(),
                new BackwardL(),
                new RightL(),
                new LeftL()
        };
    }

    @Override
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
                    }
                } catch (NoSuchSquareExistsException e) {
                    //Ignore
                }
            }
        }
        return validPaths;
    }

    @Override
    public List<Coordinate> getValidPawnPaths() {
        List<Coordinate> validPawns = new ArrayList<>();
        for (Move move : pawnPaths) {
            for (RelativeCoordinate relativeCoordinate : move.getRelativeCoordinates()) {
                Coordinate absoluteCoordinate = CoordinateHelper.determine(currentSquare.getCoordinate(), relativeCoordinate);
                try {
                    Square square = Board.getInstance().find(absoluteCoordinate);
                    if (!square.isEmpty() && !square.getPiece().getColor().equals(this.color)) {
                        validPawns.add(absoluteCoordinate);
                    }
                } catch (NoSuchSquareExistsException | NoPieceFoundException e) {
                    //Ignore
                }
            }
        }
        return validPawns;
    }

    @Override
    public String toString() {
        return "\u265E";
    }
}
