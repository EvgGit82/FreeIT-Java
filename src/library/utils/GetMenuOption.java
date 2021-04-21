package library.utils;

public class GetMenuOption {

    private int minValue;
    private int maxValue;

    public GetMenuOption(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int execute (){
        int option;
        do {
            System.out.println("Select your option: ");
            option = new GetNumberFromScanner().execute();
        } while (option < minValue || option > maxValue);

        return option;
    }
}
