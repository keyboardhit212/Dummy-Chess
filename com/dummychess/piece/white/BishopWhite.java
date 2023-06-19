package com.dummychess.piece.white;

import com.dummychess.board.Square;
import com.dummychess.board.position.Coordinate;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

import java.util.List;

public class BishopWhite extends Piece {

    public BishopWhite(Square square) {
        super(square);
        super.color = Color.WHITE;
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
                new DiagonalForwardRightFull(),
                new DiagonalForwardLeftFull(),
                new DiagonalBackwardRightFull(),
                new DiagonalBackwardLeftFull()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new DiagonalForwardRightFull(),
                new DiagonalForwardLeftFull(),
                new DiagonalBackwardRightFull(),
                new DiagonalBackwardLeftFull()
        };
    }

    @Override
    public String toString() {
        return "\u2657";
    }
}
