package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class RightOnce extends Move{

    public RightOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(0, 1)
        };
    }
}
