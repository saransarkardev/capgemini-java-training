package netflix_app;

public class Test {
	public static void main(String[] args) {

		  // Movies
        Movie m1 = new Movie("War", "Hindi", "165", "Action");
        Movie m2 = new Movie("Krish", "Hindi", "134", "Thriller");

        //Account
        Account acc1 = new Account("saran123", "ms@2200", 2);

        //Subscription
        Subscription subscription = new Subscription("349", "18-01-2027", "2");

        //User
        User user = new User("Saran", "saransarkar@gmail.com", "01-10-2003", acc1, subscription);


        //Netflix
        Netflix netflix = new Netflix(5,5);
        netflix.addMovie(m1);
        netflix.addMovie(m2);
        netflix.addUser(user);

        System.out.println("User Name: "+ netflix.getUsers()[0].getName());
        System.out.println("Subscription Amount: " + netflix.getUsers()[0].getSubscription().getAmount());









    }
}
