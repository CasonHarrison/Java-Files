public class FibIteration implements FindFib {
    public int calculate_fib(int series){
        int iteration;
        int second=1,first=1,next=0;
        if(series==1 || series==2){
            return iteration=1;
        }
        else{
            for(int i=2;i<series;i++){
                next=second+first;
                first=second;
                second=next;
                }
            return next;
            }
    }
}
