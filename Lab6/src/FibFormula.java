public class FibFormula implements FindFib {
    public int calculate_fib(int series){
        return (int) (((Math.pow(((1+Math.sqrt(5))/2),series))-Math.pow(((1-Math.sqrt(5))/2),series))/Math.sqrt(5));
    }
}
