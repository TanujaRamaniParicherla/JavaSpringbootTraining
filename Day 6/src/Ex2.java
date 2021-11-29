
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2DemoThread1 dt1=new Ex2DemoThread1();
		Ex2DemoThread1 dt2=new Ex2DemoThread1();
		Ex2DemoThread1 dt3=new Ex2DemoThread1();
		/*Thread t1 = new Thread(dt1);
		Thread t2 = new Thread(dt2);
		Thread t3 = new Thread(dt3);*/
		dt1.start();
		dt2.start();
		dt3.start();
		
		
		
		
	}

}
