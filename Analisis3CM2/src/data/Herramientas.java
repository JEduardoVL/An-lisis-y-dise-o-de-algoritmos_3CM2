/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author roban
 */
public class Herramientas {
    
    public static int[] generarArregloAleatorio(int n, int lim){
        int aux[] = new int[n];
        Random ran = new Random();
        
        for(int x=0; x<n;x++){
           aux[x] = ran.nextInt(lim); 
        }
        
        return aux;
    
    }
    
    public static int[] generarArregloPeorCaso(int n){
     
       int aux[] = new int [n];
     int e = n;
     
     for(int x = 0; x < n; x++ ){
         aux[x]=e--;
     }
     
     return aux;
    }
    
    public static int[] generarArregloMejorCaso(int n){
     
       int aux[] = new int [n];
     int e = 0;
     
     for(int x = 0; x < n; x++ ){
         aux[x]=e++;
     }
     
     return aux;
    }
    
    
    
}
