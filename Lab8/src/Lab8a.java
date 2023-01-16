import java.util.Scanner;

public class Lab8a {
    static int counter=0;
    public static int recursive_multiply(int num1,int multi){
        if(multi==1){
            return num1;
        }
        return num1 + recursive_multiply(num1,multi-1);
    }
    public static int recursive_div(int num1,int divisor){
        counter++;
        if(divisor==0){
            return -1;
        }
        if(num1==divisor){
            return 1;
        }
        if(num1<divisor){
            return 0;
        }
        else{
            int result=num1-recursive_div(num1-divisor,divisor);
        }
        return counter;

    }
    public static int recursive_mod(int num1, int divisor){
        if(divisor==0) {
            return -1;
        }
        if(num1==divisor) {
            return 0;
        }
        if(divisor<num1) {
            return recursive_mod(num1 - divisor, divisor);
        }
        else return num1;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int choice,first,second;
        do{
            counter=0;
            System.out.println("Choose from the following:\n0. Quit\n1. Multiply 2 numbers\n2. Div 2 numbers\n3. Mod 2 numbers");
            choice=sc.nextInt();
            switch(choice){
                case 0:
                    break;
                case 1:
                    System.out.println("Enter first number");
                    first=sc.nextInt();
                    System.out.println("Enter second number");
                    second=sc.nextInt();
                    System.out.println("Answer: "+recursive_multiply(first,second));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    first=sc.nextInt();
                    System.out.println("Enter second number");
                    second=sc.nextInt();
                    System.out.println("Answer: "+recursive_div(first,second));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    first=sc.nextInt();
                    System.out.println("Enter second number");
                    second=sc.nextInt();
                    System.out.println("Answer: "+recursive_mod(first,second));
            }
        }while(choice!=0);
    }
}
