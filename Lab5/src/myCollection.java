import java.util.Scanner;

public class myCollection {
    public static void main(String[] args) {
        String answer,title,author;
        int isbn,issueN;
        Item[] item = new Item[5];
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            answer = sc.next();
            if (answer.equalsIgnoreCase("B")) {
                System.out.println("Please enter the name of the Book");
                title=sc.next();
                System.out.println("Please enter the author of the Book");
                author=sc.next();
                System.out.println("Please enter the ISBN of the Book");
                isbn=sc.nextInt();
                item[i]= new Book(title,author, isbn);
                }
            if(answer.equalsIgnoreCase("P")){
                System.out.println("Please enter the name of Periodical");
                title=sc.next();
                System.out.println("Please enter the issue number");
                issueN=sc.nextInt();
                item[i]= new Periodical(title,issueN);
            }
        }
        System.out.println("Your items: ");
        for(int j=0;j<5;j++){
            item[j].getListing();
            System.out.println();
        }
    }
}
