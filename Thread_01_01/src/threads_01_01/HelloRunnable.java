package threads_01_01;

// Creating Thread by using Runnable Interface

public class HelloRunnable implements Runnable {
	
	// Implementing run method 
	
	public void run()
	{
		System.out.println("Hello from"+Thread.currentThread().getName()+" "+ 
	"a thread created by Runnable interface");
	}

}
