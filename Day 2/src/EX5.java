
class A {
	public void A() {
		System.out.println("This is method of Parent class");
	}
}

class B extends A {
	public void B() {
		System.out.println("This is method of Child class");
	}
}

class EX5 {
	public static void main(String[] args) {

		B b = new B();
		b.A();
		b.B();
	}
}