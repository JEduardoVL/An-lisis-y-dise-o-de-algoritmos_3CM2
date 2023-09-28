/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenamiento;

import escenariocomparacion.AlgortimoOrdenamientoInterface;

/**
 *
 * @author Alumno
 */
public class InsertSort implements AlgortimoOrdenamientoInterface {

           private long tiempoInicio; 
    private long tiempoFinal; 
    private long tiempoTotal;
    private long num = 0;
    
    public InsertSort() {
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotal = 0;
        
    }
    @Override
    public int[] ordenar(int[] lista) {
        this.tiempoInicio =System.currentTimeMillis();
        
        for (int i = 1; i < lista.length; i++) {  
            int temp = lista[i];  
            int j = i-1;  
            while ( (j > -1) && ( lista [j] > temp ) ) {  
                lista[j+1] = lista [j];  
                j--;  
            }  
            lista[j+1] = temp;
            num++;
        } 
                
         this.tiempoFinal = System.currentTimeMillis();
         this.tiempoTotal = (this.tiempoFinal - this.tiempoInicio);
       
         return lista;
    }

      @Override
    public long getTimepoTotal() {
        return tiempoTotal;
    }

    public long getNum() {
        return num;
}
    }



