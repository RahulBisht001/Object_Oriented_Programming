public class Thread {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.run();
        t2.run();

    }
}

class MyThread1 extends Thread {
    public void run() {
        while (true)
            System.out.println("My Thread 1 is running");
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true)
            System.out.println("My Thread 2 is running");
    }
}