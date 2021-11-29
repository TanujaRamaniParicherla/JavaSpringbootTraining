
//public class Ex2DemoThread1 implements Runnable {

	public class Ex2DemoThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running child Thread in loop : ");
		try {
			
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}

}
}
