
public class Ex6 {
    static int a = 555;
    
    public static void main(String[] args) {
        Ex6A objA = new Ex6A();
        Ex6B objB1 = new Ex6B();
        Ex6A objB2 = new Ex6B();
        Ex6C objC1 = new Ex6C();
        Ex6B objC2 = new Ex6C();
        Ex6A objC3 = new Ex6C();
        objA.display();
        objB1.display();
        objB2.display();
        objC1.display();
        objC2.display();
        objC3.display();    }
}

