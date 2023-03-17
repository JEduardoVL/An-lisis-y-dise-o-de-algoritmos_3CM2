package MetodoFibonacci;

//import MetodoFibonacci.FibonacciIterativo;
//import MetodoFibonacci.FibonacciRecursivo;

import java.util.ArrayList;


public class AnalisisFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<FibonacciInterface> aux = new ArrayList<>();
        aux.add(new FibonacciIterativo());
        aux.add(new FibonacciRecursivo());
        EscenarioComparacion2 ec = new EscenarioComparacion2(aux);
        ec.ejecutarPrueba(1,0,1,50);
        ec.mostrarResultados();
        System.out.println();
    }
    
}