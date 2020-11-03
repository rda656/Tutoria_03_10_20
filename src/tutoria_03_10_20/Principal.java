package tutoria_03_10_20;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        do{
            System.out.print("Menú:\n"
                    + "-----\n"
                    + "1. Tabla de multiplicar.\n"
                    + "2. Adivina el número.\n"
                    + "0. Salir del programa.\n"
                    + "Elija una opción: ");
            opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    tablaMultiplicar();
                    break;
                case 2:
                    adivinarNumero();
                    break;
                default:
                    System.err.println("Error. La opción introducida no es válida.");
                    break;
            }
        }while(opcion != 0);
    }
    
    public static void tablaMultiplicar(){
        Scanner teclado = new Scanner (System.in);
        int numero, resultado;
                
        System.out.println("Tabla de multiplicar.");
        System.out.println("---------------------");
        do{
            System.out.print("Introduzca el valor de la tabla de multiplicar que quiere mostrar: ");
            numero = teclado.nextInt();
            if(numero < 1 || numero > 10){
                System.err.println("Error. El valor tiene que estar comprendido entre 1 y 10.");
            }
        }while(numero < 1 || numero > 10);
        
        System.out.println("La tabla de multiplicar del " + numero + " es la siguiente:");
       
        for(int i = 0; i <= 10; i++){ // i++, i = i+1
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        boolean r;
        do{
            System.out.println("");
            r = false;
        }while(r == true);
    }
    
    public static void adivinarNumero(){
        Scanner teclado = new Scanner(System.in);
        int numeroBuscado, numeroLeido;
        
        // Vamos a crear un número aleatorio entre 0 y 100
        numeroBuscado = (int) (Math.random()*100);
        
        System.out.println("Adivinar un número.");
        System.out.println("-------------------");
        System.out.println("Adivine el número secreto. Está comprendido entre 0 y 100.");
        do{
            System.out.print("Introduzca un número: ");
            numeroLeido = teclado.nextInt();
            
            if(numeroLeido > numeroBuscado)
                System.out.println("El número que tiene que adivinar es más pequeño.");
            else if(numeroLeido < numeroBuscado)
                System.out.println("El número que tiene que adivinar es más grande.");
        }while (numeroLeido != numeroBuscado);
        System.out.println("¡Muy bien! Ha encontrado el número.");
    }
}
