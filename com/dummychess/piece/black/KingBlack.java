package com.dummychess.piece.black;

import com.dummychess.board.Square;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

public class KingBlack extends Piece {

    public KingBlack(Square square) {
        super(square);
        super.color = Color.BLACK;
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
                new ForwardOnce(),
                new DiagonalForwardRightOnce(),
                new RightOnce(),
                new DiagonalBackwardRightOnce(),
                new BackwardOnce(),
                new DiagonalBackwardLeftOnce(),
                new LeftOnce(),
                new DiagonalForwardLeftOnce()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new ForwardOnce(),
                new DiagonalForwardRightOnce(),
                new RightOnce(),
                new DiagonalBackwardRightOnce(),
                new BackwardOnce(),
                new DiagonalBackwardLeftOnce(),
                new LeftOnce(),
                new DiagonalForwardLeftOnce()
        };
    }

    @Override
    public String toString() {
        return "\u265A";
    }
}
