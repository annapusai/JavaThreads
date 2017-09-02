package threads_01_01;

// Creating thread by extending thread class

public class HelloThread extends Thread{
	
	//Overriding run method
	
	public void run()
	{
		System.out.println("Hello from"+Thread.currentThread().getName()+" "
				+ " created by extending Thread class");
	}

}
