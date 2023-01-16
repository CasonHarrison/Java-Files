public class LinkedList {
    Node head = null;
    public void add (Milk milk){
        Node temp= new Node(milk);
        if(head==null){
            head=temp;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current=current.next;
            }
            current.next=temp;
        }
    }
    public Milk getNext(){
        if(head==null){
            return null;
        }
        Node temp = head;
        head=head.next;
        return temp.milk;
    }
    public int countItems(Node current){
        int counter=0;
        while(current!=null){
            counter++;
            current=current.next;
        }
        return counter;
    }
    public boolean isEmpty(){
        return head == null;
    }
}
