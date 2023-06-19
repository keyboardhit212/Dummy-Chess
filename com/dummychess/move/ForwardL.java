package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public class ForwardL extends Move {

    public ForwardL() {
        super.relativeCoordinates = new RelativeCoordinate[] {
                new RelativeCoordinate(-2, 1),
                new RelativeCoordinate(-2, -1)
        };
    }
}
