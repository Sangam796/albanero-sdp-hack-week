//Q5. Take an input, array of numbers and return only the even values.
import java.util.*;
public class Q5 {
    public ArrayList<Integer> EvenList(ArrayList<Integer> arr) 
    {
        for(int i=0;i<arr.size();i++)
        {
            if((int)arr.get(i)%2!=0)
            arr.remove(arr.get(i));
        }
        return arr;

    }

    public void display(ArrayList arr)
    {
        
        System.out.println(arr);
    }

    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        Q5 arrayobj = new Q5();
        ArrayList <Integer>arr =  new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            arr.add(scan.nextInt());
        }
        arrayobj.display(arr);
       ArrayList<Integer> obj =  arrayobj.EvenList(arr);
        arrayobj.display(obj);
    
    }
    
}
