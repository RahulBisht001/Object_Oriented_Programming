public class ThreadExample {
    public static void main(String[] args) {

        // A3 objA = new A3();
        // objA.start();
        // A obA = new A();
        // B obB = new B();
        // C obC = new C();
        // obA.start();
        // obB.start();
        // obC.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t From Thread A :i = " + i);
        }
        System.out.println("Exit From A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("\t From Thread B :j = " + j);
        }
        System.out.println("Exit From B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("\t From Thread C :K = " + k);
        }
        System.out.println("Exit From C");
    }
}
