import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int series;
        FibIteration Iterate = new FibIteration();
        FibFormula Formula = new FibFormula();
        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        series=sc.nextInt();
        System.out.println("Fib of "+series+" by iteration is: "+Iterate.calculate_fib(series)+"\nFib of "+series+" by formula is: "+Formula.calculate_fib(series));
    }
}
