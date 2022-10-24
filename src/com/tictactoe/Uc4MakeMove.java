//UC 4-- Ability for user to make a move to a desired location in the board Select the index from 1 to 9 to make
//the move.Ensure the index is free.

package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

import static com.tictactoe.SampleTic.*;

public class Uc4MakeMove {
    public static void main(String[] args) {

        int playerScore = 0;
        int computerScore = 0;
        Scanner input = new Scanner(System.in);
        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
        playerMove(gameBoard);
        computerMove(gameBoard);

/*
    Notes:
        _ | _ | _
        _ | _ | _
          |   |
         Helpful indices
         [0][0] , [0][2] , [0][4]
         [1][0] , [1][2] , [1][4]
         [2][0] , [2][2] , [2][4]
        Player = 1
        Computer = 2
 */
    }

    public static void playerMove(char[][] gameBoard){
        System.out.println("\n***WELCOME TO TIC TAC TOE ***");
        System.out.println("\nPlease make a move. (1-9)");
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




