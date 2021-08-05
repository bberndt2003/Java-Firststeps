package com.company.game;

import java.util.ArrayList;

public class TicTacToe {
    public static void main(String[] args) {


        UserInterface userInterface = new UserInterface();

        Logic logic = new Logic();

//      SpielerNamen Wahl

        String playerOne = userInterface.getPlayerOneName();
        String playerTwo = userInterface.getPlayerTwoName();


//      Spielstein Auswahl

        String tokenOne = userInterface.getPlayerToken(playerOne);
        String tokenTwo = userInterface.getPlayerToken(playerTwo);


        ArrayList<String> gameField = new ArrayList<>();

        gameField.add("1");
        gameField.add("2");
        gameField.add("3");
        gameField.add("4");
        gameField.add("5");
        gameField.add("6");
        gameField.add("7");
        gameField.add("8");
        gameField.add("9");

//        Spielfeld
        userInterface.printGameField(gameField);
        boolean isPlayerOne = true;
        boolean winner = false;
        while (!logic.isGameFieldFull(gameField, tokenOne, tokenTwo) && winner == false) {


            if (isPlayerOne == true) {
                String coordinateOne = userInterface.insertCoordinate(playerOne);
                logic.setCoordinate(gameField, coordinateOne, tokenOne);
                winner = logic.isWinner(gameField, tokenOne);
                isPlayerOne = false;
                if (winner == true) {
                    userInterface.winnerOutput(playerOne);
                }

            } else {
                String coordinateTwo = userInterface.insertCoordinate(playerTwo);
                logic.setCoordinate(gameField, coordinateTwo, tokenTwo);
                winner = logic.isWinner(gameField, tokenTwo);
                isPlayerOne = true;
                if (winner == true) {
                    userInterface.winnerOutput(playerTwo);
                }
            }

            userInterface.printGameField(gameField);

        }
        System.out.println("Beendet");
    }
}