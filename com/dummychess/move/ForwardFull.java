package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class ForwardFull extends Move {

    public ForwardFull() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-1, 0),
                new RelativeCoordinate(-2, 0),
                new RelativeCoordinate(-3, 0),
                new RelativeCoordinate(-4, 0),
                new RelativeCoordinate(-5, 0),
                new RelativeCoordinate(-6, 0),
                new RelativeCoordinate(-7, 0)
        };
    }
}
