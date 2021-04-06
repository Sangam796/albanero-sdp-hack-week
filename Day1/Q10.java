import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
public class Q10 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> EvenList = new ArrayList();
       
        Scanner scan = new Scanner(System.in);
        int total;
        System.out.println("Enter the size of array.");
        total = scan.nextInt();
        for(int i=0;i<total;i++)
        list.add(scan.nextInt());
       
        for(Integer i : list)
        {
            if (i%2==0)
            EvenList.add(i);
        }
        System.out.println("List of elements\n"+list);
        System.out.println("List of even elements\n"+EvenList);
    }
}
