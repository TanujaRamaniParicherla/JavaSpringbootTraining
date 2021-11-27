
public abstract class EX1Shape {
		String name;
		
		public EX1Shape() {
			// TODO Auto-generated constructor stub
		}
		public EX1Shape(String name) {
			super();
			this.name = name;
		}

		

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}

		abstract float calculateArea() ;
	

}
