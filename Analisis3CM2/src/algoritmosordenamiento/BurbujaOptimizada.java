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
public class BurbujaOptimizada implements AlgortimoOrdenamientoInterface{
    
    private long tiempoInicio; 
    private long tiempoFinal; 
    private long tiempoTotal;
    private long num = 0;
    
    public BurbujaOptimizada() {
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotal = 0;
        
    }
        

    @Override
    public int[] ordenar(int[] lista) {
          this.tiempoInicio = System.currentTimeMillis();
        int temp;
        boolean flag;
         for (int i=1;i<lista.length;i++){
             flag = false;
                for (int j=0; j < lista.length-1 - i ;j++){
                    if (lista[j] > lista[j+1]) {
                        temp=lista[j];
                        lista[j]=lista[j+1];
                        lista[j+1]=temp;
                        num++;
                        flag = true;
                    }
                }
                
                if(!flag){
                    i = lista.length;
                }
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