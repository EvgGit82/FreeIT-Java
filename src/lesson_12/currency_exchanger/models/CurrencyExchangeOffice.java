package lesson_12.currency_exchanger.models;

public class CurrencyExchangeOffice {

    private int id;
    private double EURamount;
    private double USDamount;
    private double RUBamount;

    public CurrencyExchangeOffice(int id, double EURamount, double USDamount, double RUBamount) {
        this.id = id;
        this.EURamount = EURamount;
        this.USDamount = USDamount;
        this.RUBamount = RUBamount;
    }


    @Override
    public String toString() {
        return "Currency Exchange Office No. " + id + " contains " +
                ", EUR " + EURamount +
                ", USD " + USDamount +
                ", RUB " + RUBamount +
                '.';
    }
}
