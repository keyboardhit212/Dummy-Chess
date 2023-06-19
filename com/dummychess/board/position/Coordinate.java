package com.dummychess.board.position;

public record Coordinate(int x, int y) {

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Coordinate))
            return false;

        Coordinate coordinate = (Coordinate) obj;

        return (this.x() == coordinate.x() && this.y() == coordinate.y());
    }
}
