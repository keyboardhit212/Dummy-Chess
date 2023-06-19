package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class LeftOnce extends Move {

    public LeftOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(0, -1)
        };
    }
}
