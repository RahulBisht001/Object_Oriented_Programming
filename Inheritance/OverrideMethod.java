public class OverrideMethod {
    public static void main(String[] args) {

        B b = new B();
        b.show();

        A a = new A();
        a.show();

        A aa = new B();
        aa.show();

        // Error
        // B bb = new A();
    }
}

class A {
    int i = 5, j = 10;

    void show() {
        System.out.println("i : " + i + "   j : " + j);
    }
}

class B extends A {
    int k = 20;

    @Override
    void show() {
        System.out.println("k : " + k);
    }
}