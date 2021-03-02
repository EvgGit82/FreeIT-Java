package tictactoe;

/*
написать игру крестики нолики (двумерный массив размерностью 3х3).

1. Не используя классы и методы - все в методе main
2. Не используя утильные классы (Arrays и Math)
3. Игра должна продолжаться до тех пор, пока не будет выявлен победитель
(три "О" или три "Х" в ряд или по диагонали) или пока не закончатся свободные клетки.
*/

import java.util.Scanner;

import static java.lang.String.format;

public class TickTackToe {

    private static final String PLAYER_ONE = "Player 1";
    private static final String PLAYER_TWO = "Player 2";
    private static final String WIN_MESSAGE = "Game Over! %s wins!";


    public static void main(String[] args) {

        String player;

        Scanner scanner = new Scanner(System.in);

        char [][] gameField = new char[3][3];

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = '+';
            }
        }

        System.out.println("******TickTackToe Game******");
        System.out.println("****Press ENTER to start****");
        scanner.nextLine();

        player = PLAYER_ONE;

        while (true) {

            while (true) {

                for (char[] chars : gameField) {
                    for (int j = 0; j < gameField.length; j++) {
                        System.out.print(chars[j] + " ");
                    }
                    System.out.println();
                }

                System.out.println(player + ", make your move!");

                System.out.println("Enter row (1-3): ");
                int row = Integer.parseInt(scanner.nextLine().trim());
                row--;

                System.out.println("Enter column (1-3): ");
                int column = Integer.parseInt(scanner.nextLine().trim());
                column--;


                if ((player.equals(PLAYER_ONE)) && (gameField[row][column] != 'X') && (gameField[row][column] != 'O')) {
                    gameField[row][column] = 'X';
                    player = PLAYER_TWO;
                    break;
                } else if ((player.equals(PLAYER_TWO)) && (gameField[row][column] != 'X') && (gameField[row][column] != 'O')) {
                    gameField[row][column] = 'O';
                    player = PLAYER_ONE;
                    break;
                } else {
                    System.out.println("Field occupied. Let's try again!");
                }
            }


            boolean noEmptyLeft = true;

            for (char[] chars : gameField) {
                for (int j = 0; j < gameField.length; j++) {
                    if (chars[j] == '+') {
                        noEmptyLeft = false;
                    }
                }
            }


            if (((gameField[0][0] == 'X') && (gameField[0][1] == 'X') && (gameField[0][2] == 'X')) ||
                    ((gameField[1][0] == 'X') && (gameField[1][1] == 'X') && (gameField[1][2] == 'X')) ||
                    ((gameField[2][0] == 'X') && (gameField[2][1] == 'X') && (gameField[2][2] == 'X')) ||
                    ((gameField[0][0] == 'X') && (gameField[1][0] == 'X') && (gameField[2][0] == 'X')) ||
                    ((gameField[0][1] == 'X') && (gameField[1][1] == 'X') && (gameField[2][1] == 'X')) ||
                    ((gameField[0][2] == 'X') && (gameField[1][2] == 'X') && (gameField[2][2] == 'X')) ||
                    ((gameField[0][0] == 'X') && (gameField[1][1] == 'X') && (gameField[2][2] == 'X')) ||
                    ((gameField[0][2] == 'X') && (gameField[1][1] == 'X') && (gameField[2][0] == 'X'))) {
                System.out.println(format(WIN_MESSAGE, PLAYER_ONE));
                break;
            } else if (((gameField[0][0] == 'O') && (gameField[0][1] == 'O') && (gameField[0][2] == 'O')) ||
                    ((gameField[1][0] == 'O') && (gameField[1][1] == 'O') && (gameField[1][2] == 'O')) ||
                    ((gameField[2][0] == 'O') && (gameField[2][1] == 'O') && (gameField[2][2] == 'O')) ||
                    ((gameField[0][0] == 'O') && (gameField[1][0] == 'O') && (gameField[2][0] == 'O')) ||
                    ((gameField[0][1] == 'O') && (gameField[1][1] == 'O') && (gameField[2][1] == 'O')) ||
                    ((gameField[0][2] == 'O') && (gameField[1][2] == 'O') && (gameField[2][2] == 'O')) ||
                    ((gameField[0][0] == 'O') && (gameField[1][1] == 'O') && (gameField[2][2] == 'O')) ||
                    ((gameField[0][2] == 'O') && (gameField[1][1] == 'O') && (gameField[2][0] == 'O'))) {
                System.out.println(format(WIN_MESSAGE, PLAYER_TWO));
                break;
            }  else if (noEmptyLeft){
                System.out.println("It's a draw! No one wins!");
                break;
            }
        }
    }
}
