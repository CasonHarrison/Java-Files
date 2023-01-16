import java.util.LinkedList;

public class Prime {
   LinkedList<Integer> Prime = new LinkedList<>();
    public Prime(int MAX){
        boolean[] arr = new boolean[MAX+1];
        for(int i=0; i<MAX; i++){
            arr[i]=true;
        }
        for(int j=2; j*j<=MAX;j++){
            if(arr[j]){
            for(int i=j*j;i<=MAX;i+=j){
                    arr[i]=false;
                }
            }
        }
        for(int i=2; i<=MAX;i++){
            if(arr[i]){
                Prime.add(i);
            }
        }
    }
    public boolean isPrime(int num){
        for(Integer Primes : Prime) {
            if (num == Primes) {
                return true;
            }
        }
        return false;
        }
    public int getPrime(int pos){
        return Prime.get(pos);
    }
}
