package association.aggregation.library_has_book;

public class User {
	public static void main(String[] args) {
		Library library = new Library();
		library.setName("Uem Library");
		library.setLocation("Newtown");
		library.setAddress("Near Karagari Bhavan");
		library.setPincode("700135");
		
		
		
		Book[] book = library.addBook(4);
		
		book[0] = new Book("1", "Harry Potter and Chamber of secrets", "JK rowlings", "250");
		book[1] = new Book("2", "Sherlocks homes", "Arthur canon", "600");
		book[2] = new Book("3", "Perfect Murder", "Rusking Bond", "400");
		book[3] = new Book("4", "No exit", "Taylor Adam", "700");
		
		Book[] book1 = new Book[2];
		book1[0] = new Book("1", "Harry Potter and Chamber of secrets", "JK rowlings", "250");
		book1[1] = new Book("2", "Sherlocks homes", "Arthur canon", "600");
		
		Library library1 = new Library();
		library1.setName("Sukhobirsti");
		library1.setLocation("Shapoorji");
		library1.setAddress("Near Spencers");
		library1.setPincode("700211");
		
		library1.setBook(book1);
		
		System.out.println(library.getLibraryDetails());
		
		System.out.println(library1.getLibraryDetails());
		
		System.out.println("====================================================");
//			
//		for (int i=0; i<book.length; i++) {
//			System.out.println(book[i].getDetails());
//		}
        
        
	}
}
