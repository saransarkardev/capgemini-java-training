package netflix_app;

public class User{
    private String name;
    private String email;
    private String dob;

    private Subscription subscription; // composition
    private Account account;  // aggregation

    User() {

    }

    User(String name, String email, String dob, Account account, Subscription subscription) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.account = account;
        this.subscription = subscription;
    }

    public String getName() {
        return name;
    }

    public Subscription getSubscription() {
        return subscription;
    }
}
