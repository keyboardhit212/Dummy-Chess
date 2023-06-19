package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public final class DiagonalBackwardRightOnce extends Move {

    public DiagonalBackwardRightOnce() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(1, 1)
        };
    }
}
