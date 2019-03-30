import java.util.Timer;
import java.util.TimerTask;

public class Test {

    static int counter = 1;
    static Timer timer;
    public static void main(String[] args) {

        TimerTask timerTask = new TimerTask() {

            public void run() {
                counter++;           
            }
        };
        
        Thread t = new Thread(new Runnable() {

            public void run() {
                while (true) {
                    try {
			if (counter == 31) {
                            System.out.println("Ganti pemain");
                            counter = 1;
                            run();
                        }
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
			
        timer = new Timer("Timer");
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
        t.start();
    }
}
