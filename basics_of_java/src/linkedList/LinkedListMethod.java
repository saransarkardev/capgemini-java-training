package linkedList;

import java.util.LinkedList;


public class LinkedListMethod {
	public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add()
        System.out.println(list);
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add(): " + list);
        System.out.println("--------------------------------");

        // addFirst()
        System.out.println(list);
        list.addFirst("First");
        System.out.println("After addFirst(): " + list);
        System.out.println("--------------------------------");

        // addLast()
        System.out.println(list);
        list.addLast("Last");
        System.out.println("After addLast(): " + list);
        System.out.println("--------------------------------");

        // getFirst()
        System.out.println(list);
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("--------------------------------");

        // getLast()
        System.out.println(list);
        System.out.println("getLast(): " + list.getLast());
        System.out.println("--------------------------------");

        // removeFirst()
        System.out.println(list);
        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println(list);
        System.out.println("--------------------------------");

        // removeLast()
        System.out.println(list);
        System.out.println("removeLast(): " + list.removeLast());
        System.out.println(list);
        System.out.println("--------------------------------");

        // offerFirst()
        System.out.println(list);
        list.offerFirst("NewFirst");
        System.out.println("After offerFirst(): " + list);
        System.out.println("--------------------------------");

        // offerLast()
        System.out.println(list);
        list.offerLast("NewLast");
        System.out.println("After offerLast(): " + list);
        System.out.println("--------------------------------");
    }
}
