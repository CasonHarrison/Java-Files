import java.util.Random;

public class Main {
    public static int findFactor(int target, Prime prime){
        for(int i=0;i<target;i++){
            int divisor = prime.getPrime(i);
            if(target%divisor==0){
                return divisor;
            }
        }
        return -1;
    }
    public static void main (String [] args) {
        Random rand = new Random();
        final int CONSTANT = 10000;
        int max = 0;
        Prime prime=null;
        boolean approved = false, cont =false;
        while (!approved) {
            max = rand.nextInt(CONSTANT);
            if (max > 2 || !prime.isPrime(max)) {
                approved = true;
                System.out.println("What primes make up " + max);
                prime = new Prime(max);
            }
        }
        while(!cont){
            int factor = findFactor(max,prime);
            System.out.print(factor + " ");
            max=max/factor;
            if(max<2){
                cont=true;
            }
        }

    }
}
