package lesson_5;

public class Task24 {
    public static void main(String[] args) {

        TimePeriod tp1 = new TimePeriod(3700);
        System.out.print("In time period 1: " );
        tp1.showTimePeriod();

        TimePeriod tp2 = new TimePeriod(0, 1, 55);
        System.out.print("In time period 2: " );
        tp2.showTimePeriod();

        System.out.println("Total seconds is time period 2: " +tp2.calculateTotalSeconds());
        System.out.println("Time period comparison: " + tp2.compareTo(tp1));

    }
}

class TimePeriod {

    private int seconds;
    private int minutes;
    private int hours;

    public TimePeriod(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimePeriod (int seconds) {
        this.seconds = seconds;
    }

    public int calculateTotalSeconds () {
        return seconds + minutes*60 + hours*3600;
    }

    public void showTimePeriod() {
        int totalSeconds = calculateTotalSeconds();

        if (totalSeconds < 60){
            System.out.println(totalSeconds + " second(s);");
        } else if (totalSeconds < 3600) {
            System.out.println(totalSeconds/60 + " minute(s) and " + totalSeconds%60 + " second(s);");
        } else {
            System.out.println((totalSeconds/60)/60 + " hour(s) and " + (totalSeconds/60)%60
                    + " minute(s) " + totalSeconds%60 + " second(s);");
        }
    }

    public int compareTo (TimePeriod timePeriod){

        /**
         Объекты сравниваются по длительности промежутка в секунду; значение больше 0, если объект представляет
         промежуток времени арифметически больший, чем сравниваемый объект; и значение меньше 0, объект представляет
         промежуток времени арифметически меньший, чем сравниваемый объект.
         */

        int seconds1 = this.calculateTotalSeconds();
        int seconds2 = timePeriod.calculateTotalSeconds();

        if (seconds1 == seconds2) {
            return 0;
        } else
            return seconds1 - seconds2;
    }

}
