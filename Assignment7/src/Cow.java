import java.util.LinkedList;
import java.util.Random;
class Cow implements Runnable {
    static LinkedList<Node> CowMilk = new LinkedList<>();
    Random rand = new Random();
    static Node head=null;
    public void run(){
        try {
            while (true) {
                if(head==null){
                    head=new Node(new Milk());
                }
                else {
                    Milk NewMilk = new Milk();
                    Node NewNode = new Node(NewMilk);
                    CowMilk.add(NewNode);
                    int sleep = rand.nextInt(5000, 10000);
                    Thread.sleep(sleep);
                }
            }
        }
        catch(InterruptedException e) {
            System.out.println("Cow Interrupted!");
            Thread.currentThread().interrupt();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
    public static boolean haveMilk(){
        return !CowMilk.isEmpty();
    }
    public static Milk takeMilk() {
        if(head==null) {
            return null;
        }
        else{
            Node temp = head;
            head=head.next;
            return temp.milk;
        }
    }
    public int countMilk(Node current){
        int counter=0;
        while(current!=null){
            counter++;
            current=current.next;
        }
        return counter;
    }
}
