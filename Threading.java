package multithreading;

public class Threading {

	// a user could have many web tabs open
	// processes or threads

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create instance of the thread class which is task
		Task taskRun = new Task();
		taskRun.start();// start execution, run the run method
		// create thread
		System.out.println("Hi there...");// running one line single thread

	}

}

// create multithread
class Task extends Thread {// thread is a in build util in java lucky, this
							// implements the runnable method, which is a
							// abstract. uses the run is a override method
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}