package lesson19_Multipath;

public class Gazmanov extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Monitor.MIKROFON_SLAVIK_GAZMANOV){
                try {
                    Monitor.MIKROFON_SLAVIK_GAZMANOV.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            for (int i = 0; i < 1; i++) {

                System.out.println("А я хмурые дни возвращаю судьбе "+ Thread.currentThread().getName());
                    try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitor.MIKROFON_SLAVIK_GAZMANOV){
                Monitor.MIKROFON_SLAVIK_GAZMANOV.notify();

            }




        }
    }
}
