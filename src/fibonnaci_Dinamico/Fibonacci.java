package fibonnaci_Dinamico;

import java.util.Scanner;

public class Fibonacci {

    static int [] guardado= new int[20];

    public static void main(String[] args)
    {
        for(int num =0; num<20;num++)
        {
            guardado[num] =-1;
        }
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa el número que deseas de la serie =>");                                                      
        num = sc.nextInt();
        sc.close();
        System.out.println("Serie generada " + fibonaci(num));
    }

    static int fibonaci(int num)
    {
        if(guardado[num] == -1)
        {
            if( num == 1)
                guardado[num] = 1;
                else if(num == 0)
                guardado[num] = 0;
                else 
                guardado[num] = fibonaci(num-1) +fibonaci(num -2);
        }

        return guardado[num];
    }



    
}
