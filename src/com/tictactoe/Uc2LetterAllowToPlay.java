//UC 2 -- Ability to allow the player to choose a letter X or O Create a method to allow player to input X or O and call from main
//- Determine Player and Computer  Letter to play the game


package com.tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Uc2LetterAllowToPlay {
    public static void main(String[] args) {

        int playerScore = 0;
        int computerScore = 0;
        Scanner input = new Scanner(System.in);
        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
        printBoard(gameBoard);
        playerMove(gameBoard);
        computerMove(gameBoard);
    }

    public static void printBoard(char[][] gameBoard) {
        System.out.println("\n*** WELCOME TO TIC TAC TOE GAME ***");
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[0].length; col++) {
                System.out.print(gameBoard[row][col]);
            }
            System.out.println();
        }
    }
    public static void playerMove(char[][] gameBoard){
        System.out.println("Please make a move. (1-9)");
        int move = input.nextInt();
        boolean result = isValidMove(move,gameBoard);
        while(!result){
            System.out.println("Sorry! Invalid Move. Try again");
            move = input.nextInt();
            result = isValidMove(move,gameBoard);
        }
        System.out.println("Player moved at position " + move);
        updateBoard(move,1,gameBoard);


    }

    public static void computerMove(char [][] gameBoard){

        Random rand = new Random();
        int move = rand.nextInt(9)+1;

        boolean result = isValidMove(move,gameBoard);

        while(!result){
            move = rand.nextInt(9)+1;
            result = isValidMove(move, gameBoard);
        }

        System.out.println("Computer moved at position "+ move);
        updateBoard(move,2,gameBoard);
    }

}

