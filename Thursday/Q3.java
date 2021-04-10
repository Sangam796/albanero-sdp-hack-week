/*Q23. Create a singly linked-list. The list can be represented as:
  L0 -> L1 -> … → Ln - 1 -> Ln
  Reorder the list to be in the following form:
  L0 -> Ln -> L1 → Ln - 1 -> L2 -> Ln - 2 -> …*/
import java.util.*;

class Node {
    int data;
    Node next;// by defualt value for object is null\\

}

class Linkedlist {
    Node head;

    public void insertAtLast(Linkedlist list, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (list.head == null) {
            list.head = node;
        } else {
            Node traverse = list.head;
            while (traverse.next != null)
                traverse = traverse.next;
            traverse.next = node;
        }
    }

   

    public void showList(Linkedlist list) {
        Node traverse = list.head;
        while (traverse != null) {
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
        System.out.println();
    }

    public Node reverseList(Node node, Linkedlist list)
    {
        Node prev = null;
        Node current = node;
        Node nextnode = null;
        while (current != null) {
            nextnode = current.next;
            current.next = prev;
            prev = current;
            current = nextnode;
        }
        node = prev;
        return node;
    }

    public static void mergeList(Linkedlist l1, Linkedlist l2) {
        Node node1 = l1.head;
        Node node2 = l2.head;
        l2.showList(l2);
        while (node2 != null) {
            Node nextnode = node1.next;
           // System.out.println(nextnode.data);
            node1.next = node2;
            System.out.println(node1.data);
            node1 = node2;
            node2 = nextnode;
        }
        l1.showList(l1);
       
    }

    public Linkedlist replaceFirstLast(Linkedlist list)
{
    if(list.head==null||list.head.next==null)
    return null;

    Node prevnode =  list.head, faster = list.head, slower = list.head;
    while(faster!=null && faster.next!=null) // to calculate middle node
    {
        prevnode = slower;
        slower = slower.next;
        faster = faster.next.next;
    }
    prevnode.next = null;// nodes before the middle node will be detached.

        //two list to be created first= list before mid node and second = list from mid node
    Linkedlist firstlist = list;
    Linkedlist secondlist = new Linkedlist();
    secondlist.head = slower;
    System.out.println();
    showList(secondlist);
    reverseList(secondlist.head, secondlist);
    showList(secondlist);
     //mergeList(firstlist, secondlist);
     showList(firstlist);
     return firstlist;
}
}

public class Q3 {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        int n = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.insertAtLast( list,sc.nextInt());
        }
        list.showList(list);
        Linkedlist result = new Linkedlist();
        result = list.replaceFirstLast(list);
       // result.showList(result);
       

    }
}
