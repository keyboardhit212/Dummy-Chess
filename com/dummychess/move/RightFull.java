package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class RightFull extends Move {

    public RightFull() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(0, 1),
                new RelativeCoordinate(0, 2),
                new RelativeCoordinate(0, 3),
                new RelativeCoordinate(0, 4),
                new RelativeCoordinate(0, 5),
                new RelativeCoordinate(0, 6),
                new RelativeCoordinate(0, 7)
        };
    }
}
