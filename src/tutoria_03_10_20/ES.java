package tutoria_03_10_20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rda65
 */
public class ES {

    public static int leerEntero() {
        Scanner teclado = new Scanner(System.in);
                
        do{
            try {
                return teclado.nextInt();
            }
            catch(InputMismatchException e){
                System.err.println("Error. No ha introducido un número entero");
                teclado.next();
            }
        }while(true);
    }
    
    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        //int n = leerEntero();
        //return n;
        return leerEntero();
    }
    
    
}
