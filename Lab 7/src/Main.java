import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Calculator Calc = new Calculator();
        int choice;
        float first,second;
        do{
            System.out.println("0 - Exit\n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division\nPlease Choose an Option: ");
            choice=sc.nextInt();
            switch(choice){
                case 0:
                    break;
                case 1:
                    System.out.print("Please enter the first number: ");
                    first=sc.nextFloat();
                    System.out.print("Please enter the second number: ");
                    second=sc.nextFloat();
                    System.out.println(Calc.add(first,second));
                    break;
                case 2:
                    System.out.print("Please enter the first number: ");
                    first=sc.nextFloat();
                    System.out.print("Please enter the second number: ");
                    second=sc.nextFloat();
                    System.out.println(Calc.subtract(first,second));
                    break;
                case 3:
                    System.out.print("Please enter the first number: ");
                    first=sc.nextFloat();
                    System.out.print("Please enter the second number: ");
                    second=sc.nextFloat();
                    System.out.println(Calc.multiply(first,second));
                    break;
                case 4:
                    System.out.print("Please enter the first number: ");
                    first=sc.nextFloat();
                    System.out.print("Please enter the second number: ");
                    second=sc.nextFloat();
                    System.out.println(Calc.divide(first,second));
                    break;
            }
        } while(choice>0);
    }
}
