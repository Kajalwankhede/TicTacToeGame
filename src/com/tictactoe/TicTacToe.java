package com.tictactoe;

public class TicTacToe {
    public static void main(String[] args) {

        char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {' ', '|', ' ', '|', ' '}};
        dispayBoard(gameBoard);
    }

    public static void dispayBoard(char[][] gameBoard) {  ///Display the game board
        System.out.println("\n*** WELCOME TO TIC TAC TOE GAME ***");
        for (int row = 0; row < gameBoard.length; row++) {  /// for the rows
            for (int col = 0; col < gameBoard[0].length; col++) {// for column
                System.out.print(gameBoard[row][col]);
            }
            System.out.println();
        }
    }
}

