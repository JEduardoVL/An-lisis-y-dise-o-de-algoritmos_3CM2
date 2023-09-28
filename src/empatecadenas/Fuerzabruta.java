package empatecadenas;

import java.util.ArrayList;

public class Fuerzabruta {
    private String secuencia;

    public Fuerzabruta(String secuencia) {
        this.secuencia = secuencia;
    }

    public int buscarElementos(String patron){
        int i=0;
        int aux;
        int c=0;
        while(i<=secuencia.length()-patron.length()){
            aux=0;
            while(secuencia.charAt(i)==patron.charAt(aux)){
                aux+=1;
                i+=1;
                if(aux==patron.length()) break;
            }
            if(aux==patron.length()) c+=1;
            if(aux==0) i+=1;
            
        }
        return c;
    }

    public ArrayList<Integer> buscarElementos(String patron, boolean a){
        int i=0;
        int aux;
        int temp;
        ArrayList<Integer> posiciones= new ArrayList<>();
        while(i<=secuencia.length()-patron.length()){
            aux=0;
            temp=i;
            while(secuencia.charAt(i)==patron.charAt(aux)){
                aux+=1;
                i+=1;
                if(aux==patron.length()) break;
            }
            if(aux==patron.length()) posiciones.add(temp);
            if(aux==0) i+=1;
        }
        return posiciones;
    }
}