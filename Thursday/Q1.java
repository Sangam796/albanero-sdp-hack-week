/*Q21. Create a singly linked list. Group all the nodes with odd indices together followed by the nodes with even indices,
 and return the reordered list. */
import java.util.*;
class Node {
    int data;
    Node next;// by defualt value for object is null
}

class Linkedlist {
    Node head1;

    public void insertAtLast1(int data, Linkedlist list) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (list.head1 == null) {
            list.head1 = node;
        } else {
            Node traverse = list.head1;
            while (traverse.next != null)
                traverse = traverse.next;
            traverse.next = node;
        }
    }

    public void showList1(Linkedlist list) {
        Node traverse = list.head1;
        while (traverse != null) {
            System.out.print(traverse.data + " ");
            traverse = traverse.next;

        }
        System.out.println();
    }

    public Linkedlist OddEvenList(Linkedlist list1)
    {
       
        Node traverse =  list1.head1;
        Node pointToOddNode= list1.head1;
        Node pointToEvenNode = list1.head1.next;
        Node PointToFirstEvenNode = pointToEvenNode;


        while(pointToEvenNode!=null && pointToEvenNode.next!=null)
        {
            pointToOddNode.next = pointToEvenNode.next;
            pointToOddNode = pointToOddNode.next;
            pointToEvenNode.next = pointToOddNode.next;
            pointToEvenNode = pointToEvenNode.next;
        }
        pointToOddNode.next = PointToFirstEvenNode;
        return list1;
    }
   
}
public class Q1 {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insertAtLast1(sc.nextInt(),list);
        }
     Linkedlist l = new Linkedlist();
     l.showList1(list);
     l.showList1(l.OddEvenList(list));
     
    }
}
    
