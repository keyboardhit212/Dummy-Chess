package com.dummychess.piece.black;

import com.dummychess.board.Square;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

public class QueenBlack extends Piece {

    public QueenBlack(Square square) {
        super(square);
        super.color = Color.BLACK;
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
                new ForwardFull(),
                new BackwardFull(),
                new RightFull(),
                new LeftFull(),
                new DiagonalForwardRightFull(),
                new DiagonalForwardLeftFull(),
                new DiagonalBackwardRightFull(),
                new DiagonalBackwardLeftFull()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new ForwardFull(),
                new BackwardFull(),
                new RightFull(),
                new LeftFull(),
                new DiagonalForwardRightFull(),
                new DiagonalForwardLeftFull(),
                new DiagonalBackwardRightFull(),
                new DiagonalBackwardLeftFull()
        };
    }

    @Override
    public String toString() {
        return "\u265B";
    }

}
