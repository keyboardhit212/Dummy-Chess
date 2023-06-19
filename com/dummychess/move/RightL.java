package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public class RightL extends Move {

    public RightL() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-1, 2),
                new RelativeCoordinate(1, 2)
        };
    }
}
