package lesson_2.optional_tasks;

/*
Вычислить: 1+2+4+8+...+256
*/

public class OptTask10 {
    public static void main(String[] args) {

        int [] geomentricSequence = new int[25];

        for (int i = 0 ; i < 25; i++) {
            geomentricSequence[i] = calcPower(2, i);
        }

        int result = 0;

        for (int i = 0; geomentricSequence[i] < 257; i++) {
            result += geomentricSequence[i];
        }

        System.out.println(result);
    }

    // Since we are not allowed to use Math class methods, I had to write my own Math.pow()

    public static int calcPower(int number, int power) {

        if (power == 0) { return 1; }

        int multiplier = number;

        for (int i = 1; i < power; i++) {
            number *= multiplier;
        }
        return number;
    }

}
