package com.dummychess.piece.white;

import com.dummychess.board.Board;
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

public final class PawnWhite extends Piece {

    public PawnWhite(Square square) {
        super(square);
        super.color = Color.WHITE;
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
            new ForwardOnce()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new DiagonalForwardRightOnce(),
                new DiagonalForwardLeftOnce()
        };
    }

    @Override
    public List<Coordinate> getValidTraversePaths() {
        List<Coordinate> validPaths = new ArrayList<>();
        modifyFirstMove();
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

    @Override
    public String toString() {
        return "\u2659";
    }

    private void modifyFirstMove() {
        if (hasMoved) {
            super.traversePaths = new Move[] {
                    new ForwardOnce()
            };
        } else {
            super.traversePaths = new Move[] {
                    new ForwardDouble()
            };
        }
    }

}
