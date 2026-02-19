package generics;

class Box<T> {
// T - type, N - number , K - key, V - value, E - element
	T value;
	
	void set(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
}

public class Main {
	public static void main(String[] args) {
		Box<String> box = new Box();
		
		box.set("Saran");
		
		String s = box.get();
		System.out.println(s);
	}
	
}
