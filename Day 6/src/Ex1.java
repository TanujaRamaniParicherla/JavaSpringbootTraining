
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Thread t1 = new Ex1Thread("MyThread");
		Ex1Thread t2=new Ex1Thread("2nd thread");
        t1.start();
        t2.start();
	}

}
