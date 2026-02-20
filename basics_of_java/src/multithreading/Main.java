package multithreading;


class MultiThreading extends Thread{
	
	int threadNumber;
	public MultiThreading(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(i + "Thread Number : "+ threadNumber);
			if (threadNumber == 3 ) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		
	}
}

public class Main {
	public static void main(String[] args) {
		
//		MultiThreading m1 = new MultiThreading();
//		MultiThreading m2 = new MultiThreading();
		
		// Two threads m1, m2 runs at the same time.
//		m1.start();
//		m2.start();
		
		// Two threads m1, m2 runs one after another
//		m1.run();
//		m2.run();
		
		
		for (int i=0; i<5; i++) {
			MultiThreading m1 = new MultiThreading(i);
			m1.start();
		}
	}
}
