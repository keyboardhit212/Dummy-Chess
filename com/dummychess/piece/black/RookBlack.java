package com.dummychess.piece.black;

import com.dummychess.board.Square;
import com.dummychess.move.*;
import com.dummychess.piece.Color;
import com.dummychess.piece.Piece;

public class RookBlack extends Piece {

    public RookBlack(Square square) {
        super(square);
        super.color = Color.BLACK;
    }

    @Override
    protected void initializeTraversePaths() {
        super.traversePaths = new Move[] {
                new BackwardFull(),
                new ForwardFull(),
                new RightFull(),
                new LeftFull()
        };
    }

    @Override
    protected void initializePawnPaths() {
        super.pawnPaths = new Move[] {
                new BackwardFull(),
                new ForwardFull(),
                new RightFull(),
                new LeftFull()
        };
    }

    @Override
    public String toString() {
        return "\u265C";
    }
}
