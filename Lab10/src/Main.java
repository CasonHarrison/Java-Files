import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static int numLines(String file) throws Exception{
        Scanner s3 = new Scanner(new File(file));
        int numLines=0;
        while(s3.hasNext()){
            s3.nextLine();
            numLines++;
        }
        return numLines;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first file name:");
        String file1 = sc.nextLine();
        System.out.println("Enter second file name:");
        String file2 = sc.nextLine();
        try {
            Scanner s1 = new Scanner(new File(file1));
            Scanner s2 = new Scanner(new File(file2));
            int counter = 1;
            if (numLines(file1)!=numLines(file2)){
                System.out.println("Files have different number of lines");
            }
            else {
                while (s1.hasNext() && s2.hasNext()) {
                    String a = s1.nextLine();
                    String b = s2.nextLine();
                    if (!a.equals(b)) {
                        System.out.println("Line " + counter + "\n<" + a + "\n>" + b);
                    }
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find one or more files");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
