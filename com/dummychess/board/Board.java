package com.dummychess.board;

import com.dummychess.board.position.Coordinate;
import com.dummychess.piece.Color;
import com.dummychess.piece.black.PawnBlack;
import com.dummychess.piece.white.*;
import com.dummychess.piece.black.*;

public final class Board {

    public static int rows = 8;
    public static int columns = 8;
    private static Board board;

    public static Board getInstance() {
        if (board == null)
            board = new Board();
        return board;
    }

    private Square[][] squares;

    private Board() {
        this.squares = new Square[rows][columns];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.squares[i][j] = new Square(new Coordinate(i, j));
            }
        }
        initializeWhitePieces();
        initializeBlackPieces();
    }

    private void initializeWhitePieces() {
        this.squares[6][0].putPiece(new PawnWhite(this.squares[6][0]));
        this.squares[6][1].putPiece(new PawnWhite(this.squares[6][1]));
        this.squares[6][2].putPiece(new PawnWhite(this.squares[6][2]));
        this.squares[6][3].putPiece(new PawnWhite(this.squares[6][3]));
        this.squares[6][4].putPiece(new PawnWhite(this.squares[6][4]));
        this.squares[6][5].putPiece(new PawnWhite(this.squares[6][5]));
        this.squares[6][6].putPiece(new PawnWhite(this.squares[6][6]));
        this.squares[6][7].putPiece(new PawnWhite(this.squares[6][7]));
        this.squares[7][0].putPiece(new RookWhite(this.squares[7][0]));
        this.squares[7][7].putPiece(new RookWhite(this.squares[7][7]));
        this.squares[7][1].putPiece(new KnightWhite(this.squares[7][1]));
        this.squares[7][6].putPiece(new KnightWhite(this.squares[7][6]));
        this.squares[7][2].putPiece(new BishopWhite(this.squares[7][2]));
        this.squares[7][5].putPiece(new BishopWhite(this.squares[7][5]));
        this.squares[7][3].putPiece(new QueenWhite(this.squares[7][3]));
        this.squares[7][4].putPiece(new KingWhite(this.squares[7][4]));
    }

    private void initializeBlackPieces() {
        this.squares[1][0].putPiece(new PawnBlack(this.squares[1][0]));
        this.squares[1][1].putPiece(new PawnBlack(this.squares[1][1]));
        this.squares[1][2].putPiece(new PawnBlack(this.squares[1][2]));
        this.squares[1][3].putPiece(new PawnBlack(this.squares[1][3]));
        this.squares[1][4].putPiece(new PawnBlack(this.squares[1][4]));
        this.squares[1][5].putPiece(new PawnBlack(this.squares[1][5]));
        this.squares[1][6].putPiece(new PawnBlack(this.squares[1][6]));
        this.squares[1][7].putPiece(new PawnBlack(this.squares[1][7]));
        this.squares[0][0].putPiece(new RookBlack(this.squares[0][0]));
        this.squares[0][7].putPiece(new RookBlack(this.squares[0][7]));
        this.squares[0][1].putPiece(new KnightBlack(this.squares[0][1]));
        this.squares[0][6].putPiece(new KnightBlack(this.squares[0][6]));
        this.squares[0][2].putPiece(new BishopBlack(this.squares[0][2]));
        this.squares[0][5].putPiece(new BishopBlack(this.squares[0][5]));
        this.squares[0][3].putPiece(new QueenBlack(this.squares[0][3]));
        this.squares[0][4].putPiece(new KingBlack(this.squares[0][4]));
    }

    public void displayBoardCoordinates() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(this.squares[i][j].getCoordinate());
            }
            System.out.println();
        }
    }

    public Square[][] getSquares() {
        return this.squares;
    }

    public Square find(Coordinate coordinate) throws NoSuchSquareExistsException {
        for (Square[] squaresArray : this.squares) {
            for (Square square : squaresArray) {
                if (square.getCoordinate().equals(coordinate))
                    return square;
            }
        }
        throw new NoSuchSquareExistsException();
    }

    public void display() {
        for (Square[] squaresArray : this.squares) {
            for (Square square : squaresArray) {
                System.out.print(square);
            }
            System.out.println();
        }
    }
}
