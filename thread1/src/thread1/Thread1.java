package thread1;

import java.util.*;

public class Thread1 {

    Scanner input;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /* T t = new T('a');
         t.start();
         T t2 = new T('b');
         t2.start();
     
         R r = new R('c');
         Thread t3 = new Thread(r);
         t3.start();
     
         R r2 = new R('d');
         Thread t4 = new Thread(r2);
         t4.start();
         
         Contatore cont = new Contatore();
         RS r = new RS("thread111", cont);
         RS r2 = new RS("thread222", cont);
         */

        boolean exit = true;
        System.out.println("Con quanto saldo desidera iniziare? ");
        ContoCorrente conto = new ContoCorrente(input.nextFloat());
        ThreadBanca T = new ThreadBanca("cliente1" , conto );
        int answere;
        do {
            System.out.println("\n 1 - preleva\n 2 - deposita\n 3 - esci ");
            answere = input.nextInt();
            switch (answere) {
                case 1:
                    System.out.println("Quanto desidera prelevare? ");
                    conto.prelievo(input.nextFloat());
                    System.out.println("Nuovo saldo = " + conto.getSaldo());
                    break;

                case 2:
                    System.out.println("Quanto desidera depositare? ");
                    conto.deposito(input.nextFloat());
                    System.out.println("Nuovo saldo = " + conto.getSaldo());
                    break;
                    
                case 3:
                    exit = false;
                    break;

            }
        } while (exit == true);

    }

}
