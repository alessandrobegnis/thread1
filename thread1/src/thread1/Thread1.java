
package thread1;


public class Thread1 {

   
    public static void main(String[] args) {
     T t = new T('a');
     t.start();
     T t2 = new T('b');
     t2.start();
    }
    
}
