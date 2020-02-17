package thread1;

public class RS implements Runnable {

    Thread T;
    String threadName;
    Contatore cont;

    public RS(String name, Contatore cont) {
        this.threadName = name;
        this.cont = cont;
        T = new Thread(this);
        T.start();
    }

    @Override
    public void run() {
        System.out.println("Starting " + threadName);

//        synchronized (cont) {
            cont.stampaContatore();
//        }

        System.out.println("Thread " + threadName + " exiting ");
    }

}
