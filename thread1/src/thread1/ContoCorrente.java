
package thread1;

public class ContoCorrente {
    private float saldo;

    public ContoCorrente(float saldoIniziale) {
        this.saldo = saldoIniziale;
    }
    
    public void prelievo (float soldi) {
        saldo -= soldi;
    }
    
    public void deposito (float soldi) {
        saldo += soldi;
    }
    
    public float getSaldo () {
        return saldo;
    }
}
