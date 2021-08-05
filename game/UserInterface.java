package com.company.game;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

//    TicTacToe ticTacToe = new Logic();

    Logic logic = new Logic();


    public String getPlayerOneName() {
        return getPlayerName("1");
    }

    public String getPlayerTwoName() {
        return getPlayerName("2");
    }

    private String getPlayerName(String playerNumber) {
        System.out.println("Spieler " + playerNumber + " geben sie ihren Namen ein");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Spieler " + playerNumber + " hat " + name + " gewählt");
        return name;
    }



    public String getPlayerToken(String playerName) {
        System.out.println(playerName + " wählen sie entweder O oder X");
        Scanner firstPlayer = new Scanner(System.in);
        String token = firstPlayer.nextLine();
        System.out.println(playerName + " hat " + token + " gewählt");
        return token;
    }


    public void printGameField(ArrayList<String> gameField) {
        System.out.println("|---|---|---|");

        System.out.println("|" + " " + gameField.get(0) + " | " + "" + gameField.get(1) + " | " + "" + gameField.get(2) + " |");

        System.out.println("|-----------|");

        System.out.println("|" + " " + gameField.get(3) + " | " + "" + gameField.get(4) + " | " + "" + gameField.get(5) + " |");

        System.out.println("|-----------|");

        System.out.println("|" + " " + gameField.get(6) + " | " + "" + gameField.get(7) + " | " + "" + gameField.get(8) + " |");

        System.out.println("|---|---|---|");
    }

    public String insertCoordinate(String playerName) {
        System.out.println(playerName + " wählen sie ihre Koordinaten aus;    ");
        Scanner scanner = new Scanner(System.in);
        String firstCoordinates = scanner.nextLine();
        return firstCoordinates;
    }

    public void winnerOutput(String playerName) {
            System.out.println( playerName + " hat gewonnen");
            }

}