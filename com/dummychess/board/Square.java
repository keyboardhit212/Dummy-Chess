package com.dummychess.board;

import com.dummychess.board.position.Coordinate;
import com.dummychess.piece.Piece;

public final class Square {

    private final Coordinate coordinate;
    private Piece piece;

    public Square(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return new Coordinate(coordinate.x(), coordinate.y());
    }

    public void putPiece(Piece piece) {
        this.piece = piece;
    }

    public void clear() {
        this.piece = null;
    }

    public Piece getPiece() throws NoPieceFoundException {
        if (this.piece == null)
            throw new NoPieceFoundException();
        return this.piece;
    }

    public boolean isEmpty() {
        if (this.piece == null)
            return true;
        return false;
    }

    @Override
    public String toString() {
        if (this.piece == null)
            return "[ ]";
        else
            return "[" + this.piece + "]";
    }
}
