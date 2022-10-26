package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    static int playerScore = 0;
    static int computerScore = 0;
    static Scanner input = new Scanner(System.in);

            // [0][0] , [0][2] , [0][4]
             //[1][0] , [1][2] , [1][4]
             //[2][0] , [2][2] , [2][4]
            //Player = 1
           // Computer = 2
    public static void main(String [] args){

        char [][] gameBoard = {{'_','|','_','|','_'},{'_', '|', '_','|','_'},{' ','|',' ','|',' '}};
        dispayBoard(gameBoard);
        boolean gameOver = false;
        boolean playAgain = true;

        while(playAgain) { //ask to play again once win or tie player got.
            System.out.println("Welcome to Tic Tac Toe!!");
            while (!gameOver) {

                playerMove(gameBoard);
                gameOver = isGameOver(gameBoard);
                if (gameOver) {
                    break;
                }

                computerMove(gameBoard);
                gameOver = isGameOver(gameBoard);
                if (gameOver) {
                    break;
                }
            }
            System.out.println("Player Score: " +playerScore);
            System.out.println("Computer Score: "+ computerScore);
            System.out.println("Would you like to play again? Y/N");
            input.nextLine();
            String result = input.nextLine();

            switch (result){
                case "Y":
                case "y":
                    playAgain = true;
                    System.out.println("Dope! Let's play again");
                    resetBoard(gameBoard);
                    gameOver = false;
                    dispayBoard(gameBoard);
                    break;

                case "N":
                case "n":
                    playAgain = false;
                    System.out.println("Thanks for playing");
                    break;
                default:
                    break;
            }

        }
    }


    public static void dispayBoard(char [][] gameBoard){  ///Display the game board
        System.out.println("\n*** WELCOME TO TIC TAC TOE GAME ***");
        for (int row=0;row< gameBoard.length;row++) {  /// for the rows
            for (int col=0; col<gameBoard[0].length;col++) {// for column
                System.out.print(gameBoard[row][col]);
            }
            System.out.println();
        }
    }


    public static void updateBoard( int position, int player, char [][] gameBoard){

        char character;

        if(player==1){
            character = 'X';   // player =1 having X character
        }else{
            character = 'O';  // Computer =2 having O character
        }

        switch (position){

            case 1:
                gameBoard[0][0] = character; //  if the player or computer chose first position.
                dispayBoard(gameBoard);
                break;
            case 2:
                gameBoard[0][2] = character;
                dispayBoard(gameBoard);
                break;
            case 3:
                gameBoard[0][4] = character;
                dispayBoard(gameBoard);
                break;
            case 4:
                gameBoard[1][0] = character;
                dispayBoard(gameBoard);
                break;
            case 5:
                gameBoard[1][2] = character;
                dispayBoard(gameBoard);
                break;
            case 6:
                gameBoard[1][4] = character;
                dispayBoard(gameBoard);
                break;
            case 7:
                gameBoard[2][0] = character;
                dispayBoard(gameBoard);
                break;
            case 8:
                gameBoard[2][2] = character;
                dispayBoard(gameBoard);
                break;
            case 9:
                gameBoard[2][4] = character;
                dispayBoard(gameBoard);
                break;
            default:
                break;

        }

    }


    public static void playerMove(char[][] gameBoard){  //Ask player Position where whould like to move
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


    public static boolean isValidMove(int move, char[][] gameboard){ // Takes Move input from player

        switch (move){
            case 1:
                if(gameboard[0][0] == '_'){  // if position empty then return true
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

    public static void computerMove(char [][] gameBoard){// For Playing computer

        Random rand = new Random();  // used random function to play randomly by computer
        int move = rand.nextInt(9)+1;

        boolean result = isValidMove(move,gameBoard);

        while(!result){
            move = rand.nextInt(9)+1;
            result = isValidMove(move, gameBoard);
        }

        System.out.println("Computer moved at position "+ move);
        updateBoard(move,2,gameBoard);
    }


    public static boolean isGameOver(char [][] gameboard){// Checking if win condition has met is to check all spaces in combination are samw

        //Horizontal Win
        if(gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][4] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][4] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][4] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][4] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }
        if(gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][4] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][4] == 'O' ) {
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        //Vertical Wins

        if(gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[0][4] == 'X'&& gameboard[1][4] == 'X' && gameboard [2][4] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][4] == 'O'&& gameboard[1][4] == 'O' && gameboard [2][4] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        //Diagonal Wins
        if(gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][4] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][4] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][4] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][4] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }


        if (gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] != '_' &&
                gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][4] != ' ') {
            System.out.println("Its a tie");
            return true;
        }


        return false;
    }

    public static void resetBoard(char [][] gameBoard){ // set the board back to beginning state.
        gameBoard[0][0] = '_';
        gameBoard[0][2] = '_';
        gameBoard[0][4] = '_';
        gameBoard[1][0] = '_';
        gameBoard[1][2] = '_';
        gameBoard[1][4] = '_';
        gameBoard[2][0] = ' ';
        gameBoard[2][2] = ' ';
        gameBoard[2][4] = ' ';

    }
}

