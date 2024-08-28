public class LinkedList {

    public static Node head;
    
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
       //create new Node
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode; 
    }

    
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Print
    public void printList(){
        if(head==null){
          System.out.print("List is empty");
        }
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        head.next = null;
    }

    //reverse a linkedlist
    public void reverselist(){
       if(head==null || head.next==null){
          return;
       }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.addFirst(5);
       list.addFirst(4);
       list.addlast(6);
       list.addlast(8);
       list.printList();
       list.reverselist();
       list.printList();
        
    }
    
}
