package com.dummychess.piece.white;

import com.dummychess.board.Square;
import com.dummychess.board.position.Coordinate;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

import java.util.List;

public class KingWhite extends Piece {

    public KingWhite(Square square) {
        super(square);
        super.color = Color.WHITE;
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
        return "\u2654";
    }
}
