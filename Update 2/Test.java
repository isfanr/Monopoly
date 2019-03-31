import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Test {

    static int counter = 1;
	static Timer timer;
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        TimerTask timerTask = new TimerTask() {

            public void run() {
				
                counter++;           
            }
        };
        
        Thread t = new Thread(new Runnable() {

            public void run() {
                while (true) {
                    try {														
						if ((counter == 30)) {
                            counter = 0;                            
                            System.out.println("Ganti pemain");    
                        }
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
            }
		});
        
           Thread T = new Thread(new Runnable() {

            public void run() {
                while (true) {
                    try {
						
						String command = sc.nextLine();										
						if (command != null) {
                            counter = 0;                            
                            System.out.println("Ganti pemain");
                        }
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                       
                    }
                }
            }
            
        });
			
        timer = new Timer("Timer");
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
        t.start();
        T.start();
    }
}
