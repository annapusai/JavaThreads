package threads_01_01;

public class Threads_1_1 {
	
	public static void main(String args[])
	{
		(new Thread(new HelloRunnable())).start();
		
		(new HelloThread()).start();
		
		Runnable r1 = new Runnable()
				{
					public void run()
					{
						System.out.println("Hello from" + Thread.currentThread().getName()+
								"  withoud using lambda");
					}
				};
				
		Runnable r2 =() -> System.out.println("Hello from" + Thread.currentThread().getName()
				+"  using Lambda");
		
		Thread t1 = new Thread(r1,"Thread t1") ;
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
			
	}

}
