/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escenariocomparacion;

import data.Grafica;
import data.Herramientas;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class PruebaEscenario {
    
    private final ArrayList < AlgortimoOrdenamientoInterface> coleccion;
    private final Grafica grafica;
    
    public PruebaEscenario(ArrayList < AlgortimoOrdenamientoInterface> coleccion)
       
    {
    this.coleccion = coleccion;
    this.grafica = new Grafica ("Np","Tiempo","Comparacion de tiempos");
    generarSeries();
    
    }
    public void ejecutarPrueba(int np, int n, int a){
        //generamos la prueba de comparacion
        for(int p=0;p<np;p++){
            //se debe de tener un arreglo a ordenar
            int arregloOriginal []= Herramientas.generarArregloPeorCaso(n);
            
            //probar cada uno de los algoritmos que tenemos en la collecion
          for(AlgortimoOrdenamientoInterface aux: coleccion){
              aux.ordenar(arregloOriginal.clone());
              long tiempo = aux.getTimepoTotal();
              String nombre=aux.getClass().getSimpleName();
              this.grafica.getSeries().getSeries(nombre).add(p, tiempo); 
          }
          n = n + a;
        }
        
    }
    
    public void mostrar_resultados()
    {
        this.grafica.crearGrafica();
        this.grafica.muestraGrafica();
    }

    private void generarSeries() {
      //recorrer la coleccion de algoritmos para crear las series de grafica correspondientes
      for(AlgortimoOrdenamientoInterface aux:coleccion)
      {
          String nameClass=aux.getClass().getSimpleName();
          int i = this.grafica.getSeries().getSeriesIndex(nameClass);
          if (i<0)
          {
          //agregamos la nueva serie a la grafica
              this.grafica.agrearSerie(nameClass);
          }
      }
      System.out.println();
    }
    
}
