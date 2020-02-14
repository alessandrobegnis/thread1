package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class R implements Runnable {

    private char c;

    public R(char c) {
        this.c = c;
    }

    public void run() {

        while (true) {

            try {
                System.out.println("Ciao sono thread, implemento Runnable " + c);
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
