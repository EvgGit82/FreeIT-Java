package lesson_2.main_tasks;

/*
Создать двухмерный квадратный массив, и заполнить его «бабочкой».
*/

public class Task17 {

    public static void main(String[] args) {

        int arraySize = (int) (5+Math.random()*16);

        int [] [] twoDArray = new int[arraySize][arraySize];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = i; j < twoDArray[i].length - i; j++) {
                twoDArray[i][j] = 1;
            }
        }

        for (int i = twoDArray.length-1; i > twoDArray.length/2-1; i--) {
            for (int j = twoDArray.length-1 - i; j < twoDArray[i].length - (twoDArray.length-1-i); j++) {
                twoDArray[i][j] = 1;
            }
        }

        showArray(twoDArray);
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