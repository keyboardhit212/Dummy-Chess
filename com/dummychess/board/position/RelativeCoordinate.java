package com.dummychess.board.position;

public record RelativeCoordinate(int x, int y) {

    @Override
    public String toString() {
        return "(%s, %s)".formatted(this.x, this.y);
    }
}
