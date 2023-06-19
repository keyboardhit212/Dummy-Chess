package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class BackwardOnce extends Move {

    public BackwardOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(1, 0)
        };
    }
}
