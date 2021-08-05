package com.company.game;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class LogicTest {

    private Logic service;

    @Before
    public void testSetUp() {
        service = new Logic();
    }

    @Test
    public void setCoordinateTest() {
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
        service.setCoordinate(gameField, "1", "a");
        Assert.assertEquals("a", gameField.get(0));
        service.setCoordinate(gameField, "2", "b");
        Assert.assertEquals("b", gameField.get(1));
        service.setCoordinate(gameField, "3", "c");
        Assert.assertEquals("c", gameField.get(2));
        service.setCoordinate(gameField, "4", "d");
        Assert.assertEquals("d", gameField.get(3));
        service.setCoordinate(gameField, "5", "e");
        Assert.assertEquals("e", gameField.get(4));
        service.setCoordinate(gameField, "6", "f");
        Assert.assertEquals("f", gameField.get(5));
        service.setCoordinate(gameField, "7", "g");
        Assert.assertEquals("g", gameField.get(6));
        service.setCoordinate(gameField, "8", "h");
        Assert.assertEquals("h", gameField.get(7));
        service.setCoordinate(gameField, "9", "i");
        Assert.assertEquals("i", gameField.get(8));


        service.setCoordinate(gameField, "6", "z");
        Assert.assertEquals("f", gameField.get(5));
        service.setCoordinate(gameField, "f", "z");
        Assert.assertEquals("z", gameField.get(5));


    }

    @Test
    public void isGameFieldFullTest() {
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

        boolean isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "1", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "2", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "3", "O");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "4", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "5", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "6", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "7", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "8", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertFalse(isFull);

        service.setCoordinate(gameField, "9", "X");
        isFull = service.isGameFieldFull(gameField, "X", "O");
        Assert.assertTrue(isFull);



    }

    private ArrayList<String> createGameField() {

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
        return gameField;
    }


    @Test
    public void isWinnerFirstHorizontalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "1", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "2", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "3", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);

    }

    @Test
    public void isWinnerSecondHorizontalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "4", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "5", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "6", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);

    }

    @Test
    public void isWinnerThirdHorizontalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "7", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "8", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "9", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);
    }

    @Test
    public void isWinnerFirstVerticalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "1", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "4", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "7", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);
    }

    @Test
    public void isWinnerSecondVerticalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "2", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "5", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "8", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);
    }

    @Test
    public void isWinnerThirdVerticalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "3", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "6", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "9", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);
    }

    @Test
    public void isWinnerFirstDiagonalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "1", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "5", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "9", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);
    }

    @Test
    public void isWinnerSecondDiagonalTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "3", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "5", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);

        service.setCoordinate(gameField, "7", "X");
        isWinner = service.isWinner(gameField, "X");
        Assert.assertTrue(isWinner);
    }

    @Test
    public void isWinnerNoWinnerTest() {

        ArrayList<String> gameField = createGameField();

        boolean isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);


        service.setCoordinate(gameField, "1", "X");
        service.setCoordinate(gameField, "2", "O");
        service.setCoordinate(gameField, "3", "X");

        service.setCoordinate(gameField, "4", "O");
        service.setCoordinate(gameField, "5", "X");
        service.setCoordinate(gameField, "6", "O");

        service.setCoordinate(gameField, "7", "O");
        service.setCoordinate(gameField, "8", "X");
        service.setCoordinate(gameField, "9", "O");


        isWinner = service.isWinner(gameField, "X");
        Assert.assertFalse(isWinner);
        isWinner = service.isWinner(gameField, "O");
        Assert.assertFalse(isWinner);
    }
}
