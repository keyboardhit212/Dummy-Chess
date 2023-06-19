package com.dummychess.board.position;

import com.dummychess.board.InvalidMoveException;

public final class CoordinateHelper {

    private CoordinateHelper() {}

    public static Coordinate determine(Coordinate currentCoordinate,
                                       RelativeCoordinate relativeCoordinate) {
        int newX = currentCoordinate.x() + relativeCoordinate.x();
        int newY = currentCoordinate.y() + relativeCoordinate.y();
        return new Coordinate(newX, newY);
    }

    public static Coordinate translate(String position) throws InvalidColumnException, InvalidRowException {
        String[] location = position.split("");
        int row = determineRow(Integer.parseInt(location[1]));
        int column = determineColumn(location[0].charAt(0));
        return new Coordinate(row, column);
    }

    private static int determineColumn(char letter) throws InvalidColumnException {
        switch (letter) {
            case 'a':
            case 'A':
                return 0;
            case 'b':
            case 'B':
                return 1;
            case 'c':
            case 'C':
                return 2;
            case 'd':
            case 'D':
                return 3;
            case 'e':
            case 'E':
                return 4;
            case 'f':
            case 'F':
                return 5;
            case 'g':
            case 'G':
                return 6;
            case 'h':
            case 'H':
                return 7;
            default:
                throw new InvalidColumnException();
        }
    }

    private static int determineRow(int row) throws InvalidRowException {
        switch (row) {
            case 1:
                return 7;
            case 2:
                return 6;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
                return 1;
            case 8:
                return 0;
            default:
                throw new InvalidRowException();
        }
    }
}
