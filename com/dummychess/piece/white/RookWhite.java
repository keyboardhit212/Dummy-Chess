package com.dummychess.piece.white;

import com.dummychess.board.Square;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

public class RookWhite extends Piece {

    public RookWhite(Square square) {
        super(square);
        super.color = Color.WHITE;
    }

    @Override
    public String toString() {
        return "\u2656";
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
                new ForwardFull(),
                new BackwardFull(),
                new RightFull(),
                new LeftFull()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new ForwardFull(),
                new BackwardFull(),
                new RightFull(),
                new LeftFull()
        };
    }

}
