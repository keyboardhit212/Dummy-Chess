package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class DiagonalForwardLeftOnce extends Move {

    public DiagonalForwardLeftOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-1, -1)
        };
    }
}
