package com.dummychess.board;

public class NoSuchSquareExistsException extends Exception {

    public NoSuchSquareExistsException() {}

    public NoSuchSquareExistsException(String message) {
        super(message);
    }
}
