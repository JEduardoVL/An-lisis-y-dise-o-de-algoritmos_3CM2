/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis3cm2;

import algoritmosordenamiento.Burbuja;
import algoritmosordenamiento.BurbujaOptimizada;
import algoritmosordenamiento.InsertSort;
import algoritmosordenamiento.MergeSort;
import algoritmosordenamiento.Quicksort;
import escenariocomparacion.AlgortimoOrdenamientoInterface;
import escenariocomparacion.PruebaEscenario;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Analisis3CM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int arreglo [] = Herramientas.generarArregloAleatorio(110000, 1001);
//        Burbuja b = new Burbuja();
//        b.ordenar(arreglo);
//        System.out.println(b.getTiempoTotal());

       // int arr[10,9,8,7,6,5,4,3,2,1];
       






//       int np = 3000;
//       int ta = 100;
//       Burbuja b = new Burbuja();
//       long t;
//       double tiempos [] = new double[np];
//       for(int i=0;i<np;i++){
//       ta+=2;
//       int aux [] = Herramientas.generarArregloAleatorio(ta, 1000);
//       b.ordenar(aux);
//       t = b.getTiempoTotal();
//       tiempos[i]= t;
//       }
       
//        Grafica grafica = new Grafica("Prueba","Milis","Tiempos Burbuja");
//        grafica.agregarSerie("burbuja", tiempos);
//        grafica.crearGrafica();
//        grafica.muestraGrafica();

        ArrayList<AlgortimoOrdenamientoInterface>aux=
                new ArrayList<>();
        aux.add(new InsertSort());
        aux.add(new BurbujaOptimizada());
        aux.add(new Burbuja());
        aux.add(new MergeSort());
        aux.add(new Quicksort());
       
        
        // ordenamiento rapido quicksort 
        PruebaEscenario pe = new PruebaEscenario(aux);
        pe.ejecutarPrueba(2000,100,2);
        pe.mostrar_resultados();
        System.out.println();
    }
    
}
