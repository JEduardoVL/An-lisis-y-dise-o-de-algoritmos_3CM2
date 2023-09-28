package MetodoFibonacci;

import data.Grafica;
import java.util.ArrayList;


public class EscenarioComparacion2 {
    private ArrayList<FibonacciInterface> coleccion;
    private Grafica grafica;
    
    public EscenarioComparacion2(ArrayList<FibonacciInterface> coleccion) {
        this.coleccion = coleccion;
        this.grafica = new Grafica("","Tiempo","Comparación de Tiempo");
        generarSeries();
    }
    
    public void ejecutarPrueba(int n, int a, int num,int l){
        for( int p=1;p<l;p++){
            for(FibonacciInterface aux: coleccion){
                num = aux.fibonacci(p);
                long tiempo = aux.getTiempoTotal();
                String nombre = aux.getClass().getSimpleName();
                this.grafica.getSeries().getSeries(nombre).add(p, tiempo);
            }
            n= n+a;
        }
    }

    public void mostrarResultados(){
        this.grafica.crearGrafica();
        this.grafica.muestraGrafica();
    }
    
    private void generarSeries() {
        for(FibonacciInterface aux: coleccion){
            String nameClass = aux.getClass().getSimpleName();
            if(this.grafica.getSeries().getSeriesIndex(nameClass)<0){
                this.grafica.agrearSerie(nameClass);
            }            
        }
        System.out.println();
    }
}
