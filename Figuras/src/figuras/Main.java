

package figuras;

import java.util.Scanner;

/**
 *
 * @author Moisés Lopeo
 */
public class Main {
    public static void main(String args[]) {
        Figuras fig = new Figuras();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fig.rombo(num);
        //fig.piramide(0);
    }
    
}
