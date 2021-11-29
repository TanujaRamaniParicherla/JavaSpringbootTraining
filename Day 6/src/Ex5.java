
public class Ex5 {
	public static void main(String[] args) {
	Ex5Number dt1=new Ex5Number(3);
	Ex5Number dt2=new Ex5Number(5);
	Ex5Number dt3=new Ex5Number(8);
	Thread t1=new Thread(dt1);
	//System.out.println("First thread started");
	t1.start();
	Thread t2=new Thread(dt2);
//	System.out.println("second thread started");
	t2.start();
	Thread t3=new Thread(dt3);
//	System.out.println("third thread started");
	t3.start();
	
	
	}
}
