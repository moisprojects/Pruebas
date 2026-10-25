

package calculadora;


/**
 *
 * @author Moisés Lopeo
 */
public class Operar {

    public static double suma(double x, double y) {
        return x+y;
    }

    public static double diferencia(double x, double y) {
        return x-y;
    }
 
    public static double producto(double x, double y) {
        return x*y;
    }

    public static double division(double x, double y) {
        return x/y;
    }

    public static double cuadrado(double x) {
        return Math.pow(x, 2);
    }

    public static double potencia(double x, double k) {
        return Math.pow(x, k);
    }

    public static double raizCuadrada(double x) {
        return Math.sqrt(x);
    }

    public static double raizCubica(double x) {
        return Math.cbrt(x);
    }

    public static double raiz(double x, double n) {
        return Math.pow(x, 1/n);
    }

    public static double logaritmo(double x) {
        return Math.log10(x);
    }

    public static double logNeperiano(double x) {
        return Math.log(x);
    }

    public static double seno(double x) {
        return Math.sin(x);
    }
 
    public static double coseno(double x) {
        return Math.cos(x);
    }

    public static double tangente(double x) {
        return Math.tan(x);
    }
}

