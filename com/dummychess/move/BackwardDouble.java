package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public class BackwardDouble extends Move {

    public BackwardDouble() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(1, 0),
                new RelativeCoordinate(2, 0)
        };
    }
}
