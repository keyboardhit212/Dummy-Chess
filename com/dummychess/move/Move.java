package com.dummychess.move;

import com.dummychess.board.position.RelativeCoordinate;

public abstract class Move {

    protected RelativeCoordinate[] relativeCoordinates;

    public RelativeCoordinate[] getRelativeCoordinates() {
        return this.relativeCoordinates;
    }
}
