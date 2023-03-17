package empatecadenas;

public class RabinKarp {
    private String secuencia;
    
    public RabinKarp(String secuencia){
        this.secuencia = secuencia;
    }

    public int buscarElementos(String patron){
        int c =0;
        // recorrer la secuencia global
        for(int i=0; i<= secuencia.length()-patron.length();i++){
           String sub = this.secuencia.substring(i,i+patron.length());
           
          if(patron.hashCode() == sub.hashCode()){
            if(verificar(sub, patron)) c++;
            //actualizamos a i
            i+=patron.length()-1;
          }
            // se extrae una y no son iguales se deja correr y de manera 
            // normal si se extrae una y son iguales se actualiza i
        }
        return c;
        
    }

    private boolean verificar(String sub,String aux){
        if(sub.length()!=aux.length()) return false;
        for(int i=0;i<sub.length();i++){
            if(sub.charAt(i)!= aux.charAt(i)) return false;
        }

        return true;
    }
    
}
