package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public class LeftL extends Move {

    public LeftL() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-1, -2),
                new RelativeCoordinate(1, -2),
        };
    }
}
