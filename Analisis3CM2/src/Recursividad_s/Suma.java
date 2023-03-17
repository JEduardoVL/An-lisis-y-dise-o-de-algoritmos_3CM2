package Recursividad_s;

import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class Suma {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Introduzca primer numero: ");                                                           
        num1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("suma: " + suma(num1, num2));   
            sc.close();                                                       
    }
    
    public static int suma(int a, int b) {
        if (b == 0){
            return a;
        }
        
        if (a == 0) {
            return b;
        }
        
        return 1 + suma(a, b - 1);
    }
    
}
