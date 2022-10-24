//UC 5 -- Ability to check for the free space before making the desired move - Extend UC 5 to Check if the free space
//is available for the move in case available make the move.


package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

import static com.tictactoe.SampleTic.*;

public class UC5CheckForFreeSpace {
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
    public static boolean isValidMove(int move, char[][] gameboard){

        switch (move){
            case 1:
                if(gameboard[0][0] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 2:
                if(gameboard[0][2] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 3:
                if(gameboard[0][4] == '_'){
                    return true;
                } else{
                    return false;
                }

            case 4:
                if(gameboard[1][0] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 5:
                if(gameboard[1][2] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 6:
                if(gameboard[1][4] == '_'){
                    return true;
                } else{
                    return false;
                }
            case 7:
                if(gameboard[2][0] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 8:
                if(gameboard[2][2] == ' '){
                    return true;
                } else{
                    return false;
                }
            case 9:
                if(gameboard[2][4] == ' '){
                    return true;
                } else{
                    return false;
                }

            default:
                return false;
        }

    }

    
}
