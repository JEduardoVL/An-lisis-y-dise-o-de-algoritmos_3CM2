/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenamiento;

import escenariocomparacion.AlgortimoOrdenamientoInterface;

/**
 *
 * @author roban
 */
public class Burbuja implements AlgortimoOrdenamientoInterface{
    private long tiempoInicio; 
    private long tiempoFinal; 
    private long tiempoTotal; 
    private long num = 0;
    public Burbuja() {
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotal = 0;
        
    }
        
    public int [] ordenar (int lista[]){
        this.tiempoInicio = System.currentTimeMillis();
        int temp;    //1
         for (int i=1;i<lista.length;i++){     // 1 + 3n
                for (int j=0; j < lista.length-1 ;j++){   
                    if (lista[j] > lista[j+1]) {
                        temp=lista[j];
                        lista[j]=lista[j+1];
                        lista[j+1]=temp;
                        num++;
                    }
                }
         }
         this.tiempoFinal = System.currentTimeMillis();
         this.tiempoTotal = (this.tiempoFinal - this.tiempoInicio);
       
         return lista;
    }
    
    public long getNum() {
        return num;
    }

    @Override
    public long getTimepoTotal() {
        return tiempoTotal;
    }

}
