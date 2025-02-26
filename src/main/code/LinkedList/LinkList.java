class LinkList {
    
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public int size=0;
    
    public void addFirst(int data) {
        Node newnode = new Node(data);
        if(head==null) {
            head=tail=newnode;
            size++;
            return;
        }
        newnode.next=head; // adding to 1st position.
        head = newnode;
        size++;        
    }

    public void addlast(int data) {
        Node nn = new Node(data);
        if(head==null) {
            head = tail = nn;
            size++;
            return;
        }
        tail.next=nn;
        tail=nn;        
        size++;
    }

    public void index(int data ,int pos) {
        Node newnode = new Node(data);
            Node temp =head;
            for(int i=0;i<pos-1;i++) {  /* i=pos-1;temp->temp.next=newnode. */
                temp=temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
    }

    public int removefirst() {
        if(size==0) {
            System.out.println("LinkList is empty\n");
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val = head.data;
            head =tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next; // pointing head to second element.
        size--;
        return val;
    }

    public int removelast() {
        if(size==0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val =head.data;
            head=tail=null; 
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++) {
            prev=prev.next;
        }
        int val = prev.next.data; //prev->next->data.
        prev.next=null;
        tail=prev;
        //size--;
        return val;
    }

    public void print() {
        Node temp = head;
        if(temp==null) {
            System.out.println("Linklist is empty");
            return;
        }
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    } 
    
    public static void main(String args[]) {
        LinkList ll = new LinkList();
        //  ll.print();
        //  ll.addFirst(3);
        //  ll.print();
        //  ll.addFirst(2);
        //  ll.print();
        //  ll.addFirst(1);
        //  ll.print();
        //  ll.addlast(4);
        //  ll.print();
        //  ll.addlast(5);ll.print();
        //  ll.removefirst();ll.print();
        //  ll.removelast();ll.print();
        // //System.out.println("Size of linklist: "+ll.size);
        ll.print();
        ll.addlast(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(5);
        ll.print();
        ll.addlast(7);
        ll.print();
        ll.addlast(9);
        ll.print();

    }
}