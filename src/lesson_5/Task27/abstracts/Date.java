package lesson_5.Task27.abstracts;

public class Date {
    private final int MONTH;
    private final int YEAR;

    public Date(int MONTH, int YEAR) {
        this.MONTH = MONTH;
        this.YEAR = YEAR;
    }

    @Override
    public String toString() {
        if (MONTH < 10) {
            return "0" + MONTH + "/" + YEAR;
        } else {
            return MONTH + "/" + YEAR;
        }
    }
}