public class LLoperations {
    public static class Node { // defining and intialisng a node.
        int data;
        Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    }

    public static Node head;  // head and tail position should be fixed that is first and last 
    // to do any operation need to create a temp Node or object of Node and perform respective operation.
    public static Node tail;
    int size=0;

    public void addlast(int data) {
        Node nn = new Node(data); // creating a new node 
        // to be inserted through object.
        if(head==null) {
            head = tail = nn;
            size++;
            return;
        }
        tail.next=nn;
        tail=nn;
        nn.next=null;
        size++;
    }

    // liner search using linklist.            
    public int linearsearch(int key) {
        int index=0;
        Node temp=head;
        while(temp!=null) {
            if(temp.data==key) {
                System.out.println("found");
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    public void reverselist() { 
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    // check LL is pailndrome & first to find the mid.
    public Node midmNode(Node head) {
        // apply slow fast method.
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) { // Here null->null;
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; // gives mid of LL.
    }

    public boolean pailndrome() {
        if(head == null|| head.next==null) {
            return true;
        }
        Node mid = midmNode(head); // S1: To find the mid
        // S2: Reverse the 2nd half node.
        Node prev =null; Node curr = mid; Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right healf's head(after reversing)
        Node left = head; // left half's head
        // S3: Check right half == Left half

        while(right!=null) { // Right half will go till null by comparing 1st half with 2nd half
            if(left.data!=right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print() {
        Node temp=head;
        if(temp==null) {
            System.out.println("linklist is empty");
            return;
        }
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();    
    }    
    
    public static void main(String args[]) {
        LLoperations ll = new LLoperations();
        // ll.print();
        // ll.addlast(1);
        // ll.print();
        // ll.addlast(3);
        // ll.print();
        // ll.addlast(5);
        // ll.print();
        // ll.addlast(7);
        // ll.print();
        // ll.addlast(9);
        // ll.print();
        // ll.addlast(0);
        // ll.print();
        // System.out.println(ll.linearsearch(5));
        // ll.reverselist();
        // ll.print();
        ll.addlast(1); ll.addlast(0);ll.addlast(0);ll.addlast(2);
        System.out.println(ll.pailndrome());
    }
}
