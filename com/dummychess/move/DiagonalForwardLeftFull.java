package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class DiagonalForwardLeftFull extends Move {

    public DiagonalForwardLeftFull() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-1, -1),
                new RelativeCoordinate(-2, -2),
                new RelativeCoordinate(-3, -3),
                new RelativeCoordinate(-4, -4),
                new RelativeCoordinate(-5, -5),
                new RelativeCoordinate(-6, -6),
                new RelativeCoordinate(-7, -7),
        };
    }
}
