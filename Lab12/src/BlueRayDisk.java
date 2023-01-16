
import java.util.Scanner;

class BlueRayDisk {
    String title,director;
    int release;
    double cost;
    public BlueRayDisk(){}
    public BlueRayDisk(String title, String director, int release, double cost){
        this.title=title;
        this.director=director;
        this.cost=cost;
        this.release=release;
    }
    public String toString(){
        return "$"+cost+" "+release+" "+title+", "+director;
    }
}
class Node {
    Node next;
    BlueRayDisk disk;
    public Node(BlueRayDisk disk){
        this.disk = disk;
        this.next=null;
    }
}
class BlueRayDiskCollection{
    Node head = null;
    public void add(String title, String director, int release, double cost){
      BlueRayDisk disk = new BlueRayDisk(title,director,release,cost);
      Node link = new Node(disk);
      Node temp;
      if(head==null){
          head=link;
      }
      else{
          temp = head;
          while(temp.next != null){
              temp=temp.next;
          }
          temp.next=link;
      }
    }
    public void show_all(){
        Node current=head;
        while(current!=null){
            System.out.println(current.disk.toString() +" ");
            current=current.next;
        }
    }
}
class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        BlueRayDiskCollection collection = new BlueRayDiskCollection();
        int input=1;
        while(input!=0){
            System.out.println("0. Quit\n1. Add BlueRay to collection\n2. See collection");
            input = sc.nextInt();
            String title= sc.nextLine();
            if(input==1){
                System.out.println("What is the title?");
                title = sc.nextLine();
                System.out.println("Who is the director?");
                String director = sc.nextLine();
                System.out.println("What is the year of release?");
                int release = sc.nextInt();
                System.out.println("What is the cost?");
                double cost = sc.nextDouble();
                collection.add(title,director,release,cost);
            }
            if(input==2){
                collection.show_all();
            }
        }
    }
}
