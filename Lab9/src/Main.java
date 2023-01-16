import java.util.Scanner;

public class Main {
    public static void main (String [] args) throws InvalidTimeException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            String time1 = sc.next();
            int result1=TimeSplitter.TimeSplit(time1);
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            String time2 = sc.next();
            int result2=TimeSplitter.TimeSplit(time2);
            System.out.println("Difference in seconds: " + (result1 - result2)*-1);
        }catch (InvalidTimeException e){
            System.out.println(e.getMessage());
        }
    }
}
