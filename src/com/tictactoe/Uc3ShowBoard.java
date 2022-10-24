//UC 3-- As a Player would like to see the board so I can choose the valid cells to
//make my move during my turn - Write a method showBoard to display the current Board

package com.tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Uc3ShowBoard {
        public static void main(String[] args) {

            int playerScore = 0;
            int computerScore = 0;
            Scanner input = new Scanner(System.in);
            char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
            showBoard(gameBoard);
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
        public static void showBoard(char[][] gameBoard) {
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


