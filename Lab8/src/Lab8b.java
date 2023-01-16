import java.util.Scanner;

public class Lab8b {
    public static String repeatNTimes(String text, int multi){
        if(multi==1){
            return text;
        }
        return text+repeatNTimes(text,multi-1);
    }
    public static boolean isReverse(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        if(a.length()==1){
            return a.equals(b);
        }
        return ((a.charAt(0)==b.charAt(b.length() - 1)) && isReverse(a.substring(1, a.length()), b.substring(0, b.length() - 1)));
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n",100));
        System.out.println("Enter the first String");
        String first=sc.next();
        System.out.println("Enter the second String");
        String second=sc.next();
        if(isReverse(first,second)){
            System.out.println(first+" is the reverse of "+second);
        }
        else{
            System.out.println(first+" is not the reverse of "+second);
        }
    }
}
