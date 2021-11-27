
public class Ex5 {
    public static void main(String[] args) {
        Ex5FirstClass objA = new Ex5FirstClass();
        Ex5SecondClass objB = new Ex5SecondClass();
        System.out.println("in main(): ");
        System.out.println("objA.a = "+objA.getFirstClass());
        System.out.println("objB.b = "+objB.getSecondClass());
        objA.setFirstClass (222);
        objB.setSecondClass (333.33);
        System.out.println("objA.a = "+objA.getFirstClass());
        System.out.println("objB.b = "+objB.getSecondClass());
    }
}




