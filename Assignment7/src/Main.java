public class Main {
    public static void main (String [] args){
        Cow c1 = new Cow();
        Cow c2 = new Cow();
        Cow c3 = new Cow();
        Cow c4 = new Cow();
        Thread[] Cows = new Thread[4];
        Cows[0]= new Thread(c1);
        Cows[1]= new Thread(c2);
        Cows[2]= new Thread(c3);
        Cows[3]= new Thread(c4);
        for(int i=0;i<4;i++){
            Cows[i].start();
        }
        ButterFactory Factory1 = new ButterFactory();
        Thread ButterFactory = new Thread(Factory1);
        ButterFactory.start();
        CreamFactory Factory2 = new CreamFactory();
        Thread CreamFactory = new Thread(Factory2);
        CreamFactory.start();
        //Thread sleeping can sometimes interrupt program. Which won't let the while loop complete without throwing exception
    }
}
