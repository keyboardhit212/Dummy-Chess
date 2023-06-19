package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class DiagonalBackwardLeftOnce extends Move {

    public DiagonalBackwardLeftOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(1, -1)
        };
    }
}
