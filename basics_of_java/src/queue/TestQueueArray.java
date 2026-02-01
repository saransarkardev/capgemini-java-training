package queue;

public class TestQueueArray {
	 public static void main(String[] args) {

	        QueueArray queue = new QueueArray(10);

	        try {
	            queue.enqueue(9);
	            queue.enqueue(4);
	            queue.enqueue(2);
	        }
	        catch(IllegalStateException e) {
	            System.out.println("Enqueue Error: "+ e.getMessage());
	        }

	        try{
	            System.out.println("Peek Element: "+ queue.peek());
	        }
	        catch(IllegalStateException e) {
	            System.out.println("Peek Error: " + e.getMessage());
	        }
	        
	        try{
	            System.out.println("Removed Elmenent: "+queue.dequeue());
	        }
	        catch(IllegalStateException e) {
	            System.out.println("Dequeue Error: "+ e.getMessage());
	        }

	        try {
	            queue.enqueue(8);
	            queue.enqueue(1);
	            queue.enqueue(5);
	        }
	        catch(IllegalStateException e) {
	            System.out.println("Enqueue Error: "+ e.getMessage());
	        }
	        
	        System.out.print("Queue elements: ");
	        queue.display();
	    }
}
