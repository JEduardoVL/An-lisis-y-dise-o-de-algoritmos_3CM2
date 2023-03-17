package empatecadenas;

public class EmpateMain {
    
    public static void main(String[] args) {
        String aux = new String("holaholaccefbubhoakwfholaholakebfshola");
        String aux2 = new String("hola");
        RabinKarp rk = new RabinKarp(aux);
        Fuerzabruta fb = new Fuerzabruta(aux);
        System.out.println("Usando Rabin Karp =" + rk.buscarElementos(aux2));
        System.out.println("Usando FUerza Bruta ="+ fb.buscarElementos(aux2));
    }

    
}
