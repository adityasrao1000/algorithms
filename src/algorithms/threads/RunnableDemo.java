package algorithms.threads;

public class RunnableDemo implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static void main(String args[]) {
		RunnableDemo d = new RunnableDemo();
		Thread t = new Thread(d);
		t.start();
	}
}
