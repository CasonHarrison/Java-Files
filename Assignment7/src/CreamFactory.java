import java.util.ArrayList;

public class CreamFactory implements Runnable{
    ArrayList<Milk> MilkAmount = new ArrayList<>();
    public void run(){
        try{
            while(true){
                if(Cow.haveMilk()){
                    MilkAmount.add(Cow.takeMilk());
                    System.out.println("Cream factory got milk from a cow");
                    System.out.println("Now Cream factory has "+MilkAmount.size()+" milk");
                }
                if(MilkAmount.size()==2){
                    System.out.println("I made cream");
                    MilkAmount.clear();
                }
                Thread.sleep(1000);
            }
        } catch(Exception e){
            System.out.println("Error in CreamFactory");
            Thread.currentThread().interrupt();
        }
    }
}
