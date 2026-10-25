

package figuras;

/**
 *
 * @author Moisés Lopeo
 */
public class Figuras {
    public void rombo(int n) {
        /*if (n<1) {
            System.out.println("Envia un número mayor a 1");
            return;
        }*/
        int a = 0;
        for (int i=n; i>0; i--) {
            a++;
            System.out.println("");
            
            for (int e=0; e<a; e++) {
                System.out.print("*");
            }
        }
        for (int i=0; i<n; i++) {
            a++;
            System.out.println("");
            
            for (int e=0; e<a; e++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    
    public void piramide(int n) {
        if (n<1) {
            System.out.println("Envia un número mayor a 1");
            return;
        }
        for (int i=0; i<n; i++) {
            System.out.println("*");
            for (int e=0; e<n; e++) {
                System.out.print("*");
            }
        }
    }
    
}
