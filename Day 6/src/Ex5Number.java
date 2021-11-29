
public class Ex5Number implements Runnable {
	int n;
	
	
	public Ex5Number(int n) {
		super();
		this.n = n;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			//try {
				
			
			if(i%n==0)
			{
				System.out.println("Thread1 is running");
				System.out.println(i);
			//	Thread.sleep(2000);
			}
			else if(i%n==0)
			{
				System.out.println("Thread2 is running");
				System.out.println(i);
		//		Thread.sleep(2000);
			}
			else if(i%n==0)
			{
				System.out.println("Thread3 is running");
				System.out.println(i);
	//			Thread.sleep(2000);
			}
		//	}
			/*catch(InterruptedException ie)
			{
				System.out.println(ie.getMessage());
			}*/
		}

	}

}
