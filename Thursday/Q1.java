
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

    public Linkedlist OddEvenList(Linkedlist list1, Linkedlist list2)
    {
       
        Node traverse =  list1.head1;
        int element;
        int index=0;
        while(traverse!=null)
        {
            index++;
            element =  traverse.data;
            if(index%2!=0)
            list2.insertAtLast1(element,list2);
            traverse = traverse.next;
        }
         traverse =  list1.head1;
        index=0;
        while(traverse!=null)
        {
            index++;
            element =  traverse.data;
            if(index%2==0)
            list2.insertAtLast1(element, list2);
            traverse = traverse.next;
        }
        return list2;
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
     Linkedlist resultList = new Linkedlist();
     Linkedlist l = new Linkedlist();
     l.showList1(list);
     l.showList1(l.OddEvenList(list, resultList));
     
    }
}
    
