import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Q7 {
    public LinkedList<Integer> arraysOfMultiplies(int multiplier, int lastnum)
    {
        LinkedList<Integer> list1 = new LinkedList();
        for(int i=1;i<=lastnum;i++)
        {
            list1.addLast(multiplier*i);
        }
        return list1;
    }
    public static void main(String[] args) {
        Q7 mulObject = new Q7();
        Scanner sc = new Scanner(System.in);
        int mult, last;
        mult = sc.nextInt();
        last = sc.nextInt();
        System.out.println(mulObject.arraysOfMultiplies(mult, last));

    }
}
