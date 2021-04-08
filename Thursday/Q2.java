import java.util.LinkedList;
import java.util.Scanner;

class Q2
{   
public static LinkedList<Integer> swapAdjacentNodes(LinkedList<Integer> list)
{
    for(int i=0;i<list.size()-1;i+=2)
    {
        int num1 = list.get(i);
        int num2 = list.get(i+1);
        list.set(i,num2);
        list.set(i+1,num1);
    }
    return list;
}
    public static void main(String[] args) {
        LinkedList <Integer> list1 = new LinkedList<Integer>();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        
            System.out.println(Q2.swapAdjacentNodes(list1));
    }
}