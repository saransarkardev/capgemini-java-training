package netflix_app;

public class Subscription{
    private String amount;
    private String end_date;
    private String no_of_devices;

    Subscription(String amount, String end_date, String no_of_devices) {
        this.amount = amount;
        this.end_date = end_date;
        this.no_of_devices = no_of_devices;
    }

    public String getAmount() {
        return amount;
    }

}