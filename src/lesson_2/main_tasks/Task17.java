package lesson_2.main_tasks;

/*
Создать двухмерный квадратный массив, и заполнить его «бабочкой».
*/

import java.util.Random;

public class Task17 {

    public static void main(String[] args) {

        int arraySize = new Random().nextInt(45) + 5;

        int[][] twoDArray = new int[arraySize][arraySize];

        makeButterflyArray(twoDArray);

        showArray(twoDArray);
    }


    public static int[][] makeButterflyArray (int[][] twoDArray) {

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = i; j < twoDArray[i].length - i; j++) {
                twoDArray[i][j] = 1;
            }
        }

        for (int i = twoDArray.length - 1; i > twoDArray.length / 2 - 1; i--) {
            for (int j = twoDArray.length - 1 - i; j < twoDArray[i].length - (twoDArray.length - 1 - i); j++) {
                twoDArray[i][j] = 1;
            }
        }

        return twoDArray;
    }


    public static void showArray (int [][] array ) {

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
