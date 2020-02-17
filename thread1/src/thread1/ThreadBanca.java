
package thread1;


public class ThreadBanca implements Runnable{
    ContoCorrente conto;
    String cliente;
    ThreadBanca(String cliente1 , ContoCorrente conto) {
        cliente = cliente1;
        this.conto = conto;
    }

    @Override
    public void run() {
        
    }
    
}
