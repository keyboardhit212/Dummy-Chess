package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class DiagonalForwardRightOnce extends Move {

    public DiagonalForwardRightOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-1, 1)
        };
    }
}
