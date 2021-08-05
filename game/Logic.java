package com.company.game;

import java.util.ArrayList;

public class Logic {

    public void setCoordinate(ArrayList<String> gameField, String coordinate, String token) {
        int coordinateCount = 0;
        while (coordinateCount != gameField.size()) {
            if (coordinate.equals(gameField.get(coordinateCount))) {
                gameField.set(coordinateCount, token);
            }
            coordinateCount = coordinateCount + 1;
        }
    }

    public boolean isGameFieldFull(ArrayList<String> gameField, String tokenOne, String tokenTwo) {
        int coordinateCount = 0;
        while (coordinateCount != gameField.size()) {
            if (!tokenOne.equals(gameField.get(coordinateCount)) && !tokenTwo.equals(gameField.get(coordinateCount))) {
                return false;
            }
            coordinateCount = coordinateCount + 1;
        }
        return true;
    }


    public boolean isWinner(ArrayList<String> gameField, String token) {

//        Vertikal Gewinn
        if (gameField.get(0).equals(token) && gameField.get(1).equals(token) && gameField.get(2).equals(token)) {
            return true;
        }

         else if (gameField.get(3).equals(token) && gameField.get(4).equals(token) && gameField.get(5).equals(token)) {
            return true;
        }

        else if (gameField.get(6).equals(token) && gameField.get(7).equals(token) && gameField.get(8).equals(token)) {
            return true;
        }

//        Horizontal Gewinn
        else if (gameField.get(1).equals(token) && gameField.get(4).equals(token) && gameField.get(7).equals(token)) {
            return true;
        }

        else if (gameField.get(2).equals(token) && gameField.get(5).equals(token) && gameField.get(8).equals(token)) {
            return true;
        }

        else if (gameField.get(3).equals(token) && gameField.get(6).equals(token) && gameField.get(9).equals(token)) {
            return true;
        }

//        Diagonal Gewinn
        else if (gameField.get(1).equals(token) && gameField.get(5).equals(token) && gameField.get(9).equals(token)) {
            return true;
        }

        else if (gameField.get(3).equals(token) && gameField.get(5).equals(token) && gameField.get(7).equals(token)) {
            return true;
        }

        return false;
    }

}
