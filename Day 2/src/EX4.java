import java.util.ArrayList;
import java.util.List;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EX4Class cls1 = new EX4Class();
		EX4Class cls2 = new EX4Class();
		cls1.setRoomno(1);
		cls1.setRoomtype("Large");
		cls1.setRoomarea(500);
		cls1.setACmachine(1.5);

		cls2.setRoomno(2);
		cls2.setRoomtype("medium");
		cls2.setRoomarea(350);
		cls2.setACmachine(1);

		List<EX4Class> listobj = new ArrayList<EX4Class>();
		listobj.add(cls1);
		listobj.add(cls2);

		for (EX4Class lb : listobj) {
			System.out.println("details of class:" + lb.getRoomno() + "\t" + lb.getRoomtype() + "\t" + lb.getRoomarea()
					+ "\t" + lb.getACmachine());
		}

	}

}
