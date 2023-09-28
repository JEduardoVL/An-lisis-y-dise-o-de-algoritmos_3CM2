package problema_mochila;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el peso maximo de la mochila:"); //capacidad de la mochila
        int k = scanner.nextInt();  //k
        System.out.println("Ingresa el numero maximo de elementos");
        int a = scanner.nextInt();    

        
        
        int[] beneficio = new int[a +1];
        for(int p=0;p<a;p++)
        {
            int[] peso = new int[p];
            System.out.println("Ingresa los datos es la posición ="+ p);
            peso[p] = scanner.nextInt(); //n

        for(int i=0; i<a;i++)
        {
            System.out.println("Ingresa el beneficio =");
            beneficio[i] = scanner.nextInt();    // we
        }
        
        }
        
        
        scanner.close();

        Element[][] elementMatrix = new Element[a + 1][k + 1];

        elementMatrix[0][0] = new Element(true);

        for (int i = 1; i <= k; i++) {
            elementMatrix[0][i] = new Element(false);
        }

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= k; j++) {
                elementMatrix[i][j] = new Element(false);
                if (elementMatrix[i - 1][j].isExists()) {
                    elementMatrix[i][j].setExists(true);
                    elementMatrix[i][j].setIncludes(false);
                } else if (j >= beneficio[i]) {  
                    if (elementMatrix[i][j - beneficio[i]].isExists()) {
                        elementMatrix[i][j].setExists(true);
                        elementMatrix[i][j].setIncludes(true);
                    }
                }
                
            }
        }
        List<Integer> solution = new ArrayList<>(a);
                if (elementMatrix[a][k].isExists()) {  
                    int i = a;
                    int j = k;
                    while (j > 0 && i > 0) {
                        if (elementMatrix[i][j].isIncludes()) {
                            solution.add(i);
                            j = j - beneficio[i];
                        }
                        i = i - 1;
                    }
                }

                System.out.println("The elements with the following indexes are in the solution:\n" + (solution.toString()));  
        scanner.close();
    }

    
}
