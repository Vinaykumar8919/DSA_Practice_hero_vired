import java.util.Stack;

class Node{
    public Object item;
    public Node next;
}

class linkedListImp {
    private int size =  0;
     Node head;
    public linkedListImp() {// constructor
        this.size = 0;
        this.head=null;
    }
    public void add(Object i) {
        Node n = new Node();
        n.item = i;
        n.next = this.head;
        this.head = n;
		this.size++;
    }
    public void display() {
		Node current = this.head;
		while(current!=null) {
			System.out.print(current.item+"-> ");
			current=current.next;
		}
		System.out.println("END");
	}
}

public class LinkedListpalindrome {

    public static boolean isPlaindrome(Node head) {
       Node last = head;
        Stack<Object> s=  new Stack<>();
        while(last!=null) {
            s.add(last.item);
            last=last.next;
        }

        while(head!=null) {
            if(head.item != s.pop()) {
                return false;
                
            }
            head=head.next;
        }
        return true;
    }

    public static void main(String[] args) {
		linkedListImp list = new linkedListImp();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        if(isPlaindrome(list.head)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
    
}
