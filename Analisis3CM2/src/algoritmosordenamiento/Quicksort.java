package algoritmosordenamiento;

import escenariocomparacion.AlgortimoOrdenamientoInterface;

public class Quicksort implements AlgortimoOrdenamientoInterface{

    private long tiempoInicio; 
    private long tiempoFinal; 
    private long tiempoTotal; 
    private long num = 0;
    private int[] datos;
    public Quicksort() {
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotal = 0;
        
    }
        
    public int [] ordenar (int lista[]){
        this.datos = lista;
        int tmpArray[] = this.datos.clone();
        this.tiempoInicio = System.currentTimeMillis();
            ordenar(tmpArray,0,tmpArray.length-1);
         this.tiempoFinal = System.currentTimeMillis();
         this.tiempoTotal = (this.tiempoFinal - this.tiempoInicio);
       
         return this.datos;
    }


    public static void ordenar(int arr[], int izq, int der) {

        int pivote=arr[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
       
        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(arr[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
           while(arr[j] > pivote) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux= arr[i];                      // los intercambia
               arr[i]=arr[j];
               arr[j]=aux;
           }
         }
         
         arr[izq]=arr[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         arr[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         
         if(izq < j-1)
            ordenar(arr,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            ordenar(arr,j+1,der);          // ordenamos subarray derecho
         
      }







    public long getNum() {
        return num;
    }

    @Override
    public long getTimepoTotal() {
        return tiempoTotal;
    }
    
}
