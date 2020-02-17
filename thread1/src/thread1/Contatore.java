package thread1;

public class Contatore {

    public synchronized void stampaContatore() {
        for (int i = 5; i > 0; i--) {
            System.out.println("\tcontatore: " + i);
        }
    }
}
