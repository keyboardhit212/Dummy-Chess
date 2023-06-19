package com.dummychess;

import com.dummychess.board.*;
import com.dummychess.board.position.Coordinate;
import com.dummychess.board.position.CoordinateHelper;
import com.dummychess.board.position.InvalidColumnException;
import com.dummychess.board.position.InvalidRowException;
import com.dummychess.piece.Color;
import com.dummychess.piece.InvalidPieceSelectionException;
import com.dummychess.piece.Piece;
import com.dummychess.screen.Screen;
import com.dummychess.utils.Winner;
import com.dummychess.utils.WinnerFoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfVsSelf {

    private static Scanner console = new Scanner(System.in);
    private static Color currentColor = Color.WHITE;

    public static void main(String[] args) {
        Board board = Board.getInstance();
        Screen.clear();
        while (true) {
            board.display();
            try {
                System.out.println();
                Winner.checkWinner();
                System.out.println("Current Turn: " + currentColor.toString());
                System.out.print("Piece At: ");
                String position = console.next();
                Coordinate coordinate = CoordinateHelper.translate(position);
                Square square = board.find(coordinate);
                Piece piece = square.getPiece();
                if (!piece.getColor().equals(currentColor))
                    throw new InvalidPieceSelectionException();

                while (true) {
                    try {
                        System.out.print("Move To: ");
                        String moveLocation = console.next();
                        Coordinate moveCoordinate = CoordinateHelper.translate(moveLocation);
                        piece.move(moveCoordinate);
                        break;
                    } catch (InvalidMoveException e) {
                        System.out.println("Illegal Move!");
                    }
                }
            } catch (NoSuchSquareExistsException e) {
                System.out.println("Nonexistent!");
                continue;
            } catch (NoPieceFoundException e) {
                System.out.println("Empty!");
                continue;
            } catch (InputMismatchException e) {
                console.nextLine();
                System.out.println("Invalid Input!");
                continue;
            } catch (InvalidColumnException | InvalidRowException | NumberFormatException e) {
                System.out.println("Location Invalid!");
                continue;
            } catch (InvalidPieceSelectionException e) {
                System.out.println("Cannot Move Enemy's Piece!");
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Command Unrecognized!");
                continue;
            } catch (WinnerFoundException e) {
                System.out.println("Game Over!");
                System.out.println(currentColor.name() + " Player Won!");
                break;
            } catch (Exception e) {
                System.out.println("Error!");
            } finally {
                Screen.pause();
                Screen.clear();
            }
            switchPlayerTurn();
        }
    }

    public static void switchPlayerTurn() {
        if (currentColor == Color.WHITE)
            currentColor = Color.BLACK;
        else
            currentColor = Color.WHITE;
    }
}
