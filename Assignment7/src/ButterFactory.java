import java.util.ArrayList;

public class ButterFactory implements Runnable{
    ArrayList<Milk> MilkAmount = new ArrayList<>();
    public void run(){
        try {
            while (true) {
                if (Cow.haveMilk()) {
                    MilkAmount.add(Cow.takeMilk());
                    System.out.println("Butter factory got milk from a cow");
                    System.out.println("Now Butter factory has " + MilkAmount.size() + " milk");
                }
                if (MilkAmount.size() == 4) {
                    System.out.println("I made butter");
                    MilkAmount.clear();
                }
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            System.out.println("Error in the Butter factory");
            }
        }

}
