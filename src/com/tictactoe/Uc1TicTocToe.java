//UC 1-- As a Player would like to start fresh by creating a tictac toe board - Create a TicTacToeGame class - Create method for every use case
//and call from main Create a board of char[] of size 10 and assign empty space to each
//element-0th index is ignored to make it UC 1 user friendly.

package com.tictactoe;
import java.util.Scanner;
public class Uc1TicTocToe {
    public static void main(String[] args) {
        int playerScore = 0;
        int computerScore = 0;
        Scanner input = new Scanner(System.in);
            char [][] gameBoard = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
            printBoard(gameBoard);

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
        public static void printBoard (char[][] gameBoard){
            System.out.println("\n*** WELCOME TO TIC TAC TOE GAME ***");
            for (int row=0;row< gameBoard.length;row++) {
                for (int col=0; col<gameBoard[0].length;col++) {
                    System.out.print(gameBoard[row][col]);
                }
                System.out.println();
            }
        }
    }
