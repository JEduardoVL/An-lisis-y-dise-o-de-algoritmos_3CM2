package MetodoFibonacci;




public class FibonacciIterativo implements FibonacciInterface{
    private long tiempoInicio; 
    private long tiempoFinal; 
    private long tiempoTotal;
    public FibonacciIterativo(){
        this.tiempoFinal = 0;
        this.tiempoInicio = 0;
        this.tiempoTotal = 0;
          }
        private static int funcionFibonacci(int num){
            int siguiente;
            int actual;
            int temporal;
            siguiente = 1;
            actual = 0;
		for (int i = 1; i < num; i++) {
			temporal = actual;
			actual = siguiente;
			siguiente = siguiente + temporal;
		}
        return actual;
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
