package lesson19_Multipath;

public class Slavik extends Thread {
private boolean needStop = false;
int round = 0;
    @Override
    public void run() {
        while (!needStop){
            round++;
            if(round>3){
                needStop=true;
            }
            for (int i = 0; i < 1; i++) {
                System.out.println(Thread.currentThread().getClass() +" А я ясные дни оставляю себе " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        synchronized (Monitor.MIKROFON_SLAVIK_GAZMANOV){
                Monitor.MIKROFON_SLAVIK_GAZMANOV.notify();

        }

            synchronized (Monitor.MIKROFON_SLAVIK_GAZMANOV){
                try {
                    Monitor.MIKROFON_SLAVIK_GAZMANOV.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }



        }
    }
}
