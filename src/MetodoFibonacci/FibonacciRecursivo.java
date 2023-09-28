package MetodoFibonacci;



public class FibonacciRecursivo  implements FibonacciInterface{
    private long tiempoInicio; 
    private long tiempoFinal; 
    private long tiempoTotal;
    public FibonacciRecursivo(){
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotal = 0;
          }
        private static int funcionFibonacci(int num){
        return switch (num) {
            case 1 -> 0;
            case 2 -> 1;
            default -> funcionFibonacci(num-1) + funcionFibonacci(num-2);
        };
     }

    @Override
    public int fibonacci(int lim) {
        this.tiempoInicio = System.currentTimeMillis();
        int num = funcionFibonacci(lim);
        this.tiempoFinal = System.currentTimeMillis();
        this.tiempoTotal = (this.tiempoFinal - this.tiempoInicio);
        return num;
    }
    
        public long getTiempoTotal() {
        return tiempoTotal;
}
}
