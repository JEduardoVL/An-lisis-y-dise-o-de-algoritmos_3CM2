package analisis3cm2;

public class prueba_quick {


    

      public static void main(String[] args) 
      {
        int arr[] = new int[]{10,9,8,7,6,5,4,3,2,1};

        System.out.println("Vector original");
        imprimirVector(arr);
        quickSort(arr);
        System.out.println("\nVector ordenado");
        imprimirVector(arr);
        


      }

      public static void quickSort(int arr[]){
        /*for(int i=0; i<arr.length;i++)
        {
            prueba(arr,0,i-1);
        }*/
        final int N=arr.length;
        prueba(arr, 0, N-1);
}

      public static void prueba(int arr[], int izq, int der) {
    
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
            prueba(arr,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
            prueba(arr,j+1,der);  
         
      }

      public static void imprimirVector(int arr[]){
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
}


    
}
