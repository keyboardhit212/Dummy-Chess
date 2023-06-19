package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class ForwardOnce extends Move {

    public ForwardOnce() {
        super.relativeCoordinates =  new RelativeCoordinate[] {
                new RelativeCoordinate(-1, 0)
        };
    }
}
