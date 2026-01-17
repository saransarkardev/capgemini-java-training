package association.aggregation.library_has_book;

public class Library {
    
    private String name; // null
    private String location; // null
    private String address; //null
    private String pincode; //null

    private Book[] book; // null

    public Book[] addBook(int size) {
        return new Book[size];
    }

    // getters
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public String getAddress() {
        return address;
    }
    public String getPincode() {
        return pincode;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setBook(Book[] book) {
    	this.book = book;
    }
    
    public String getLibraryDetails() {
    	return "Name: "+name+" Location: "+location+" Address: "+address+ "Pincode: "+pincode; 
    }
}
