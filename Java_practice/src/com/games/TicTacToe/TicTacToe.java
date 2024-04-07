package com.games.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int row;
        int colomn;

        System.out.println("Welcome To Tic Tac Toe!");

        String[][] gameBoard = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"} };

        displayBoard(gameBoard);

        System.out.println("Chose a number to print enter the row followed by the position");
        row = userInput.nextInt() - 1;
        colomn = userInput.nextInt() - 1;

        System.out.println("You selected: " + gameBoard[row][colomn]);
        System.out.println("Position: " + gameBoard[row][colomn] + " Will now be set to X");
        gameBoard[row][colomn] = "X";
        displayBoard(gameBoard);



    }


    public static void displayBoard(String[][] gameBoard){
        for (String[] displayGameBoard : gameBoard) {
            for (int j = 0; j < displayGameBoard.length; ++j) {
                System.out.print(displayGameBoard[j]);
                if (j < 2){
                    System.out.print("|");
                }
                if (j == 2){
                    System.out.println(" ");
                }
            }
        }
    }
}
