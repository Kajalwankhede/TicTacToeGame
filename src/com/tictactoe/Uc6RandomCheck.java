//As a User would like to  do a toss to check who plays first. Use Random to determine Heads orTails and assign accordingly who
//UC 6 starts first, the computer or the user



package com.tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Uc6RandomCheck {
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
            System.out.println("Toss to check who plays first.");

            int player=1;
            int check = (int) Math.floor((Math.random() * 10) % 2);
            if(check==player){
                System.out.printf("Player Turn");
            }
            else{
                System.out.printf("Computer Turn.");
            }

            System.out.println();


            for (int row=0;row< gameBoard.length;row++) {
                for (int col=0; col<gameBoard[0].length;col++) {

                    System.out.print(gameBoard[row][col]);
                }
                System.out.println();
            }
        }
    }


