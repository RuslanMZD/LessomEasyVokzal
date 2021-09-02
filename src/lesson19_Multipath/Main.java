package lesson19_Multipath;

public class Main {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        thread1.start(); // всегда только старт а не ран
        Thread thread2 = new Thread(new MyThread2());
        thread2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
