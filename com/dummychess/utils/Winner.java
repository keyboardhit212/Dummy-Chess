package com.dummychess.utils;

import com.dummychess.board.Board;
import com.dummychess.board.NoPieceFoundException;
import com.dummychess.board.Square;
import com.dummychess.piece.Piece;
import com.dummychess.piece.black.KingBlack;
import com.dummychess.piece.white.KingWhite;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    public static void checkWinner() throws WinnerFoundException {
        List<Piece> kings = new ArrayList<>();
        Square[][] squares = Board.getInstance().getSquares();
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                try {
                    Piece piece = squares[i][j].getPiece();
                    if ((piece instanceof KingWhite) || (piece instanceof KingBlack))
                        kings.add(piece);
                } catch (NoPieceFoundException e) {
                    //Ignore
                }
            }
        }
        if (kings.size() == 1) {
            throw new WinnerFoundException();
        }
    }
}
