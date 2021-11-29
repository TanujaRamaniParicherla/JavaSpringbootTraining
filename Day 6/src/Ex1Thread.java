import java.util.Date;

public class Ex1Thread extends Thread {
	String name;

	public Ex1Thread(String name) {
		super();
		this.name = name;
	}
	public void run()
	{
		try {
            for(int i=0; i<2; i++) {
            	Date date = new Date();
               System.out.println(date);
                Thread.sleep(10000);
            }
        }

            catch(InterruptedException e) {
                System.out.println("Thread interrupted");
            }
	}
	

}
