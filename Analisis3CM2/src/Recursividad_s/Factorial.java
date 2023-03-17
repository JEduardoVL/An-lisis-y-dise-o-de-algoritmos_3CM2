package Recursividad_s;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Factorial {
     public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
         
        System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    }
     
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
    
}

// fibona