//Q4. Takes an input array of numbers and return a new array, sorted in ascending order (smallest to biggest). If the function's argument is null, an empty array, or undefined; return an empty array.
import java.util.*;
public class Q4 {
    public ArrayList<Integer> Sort(ArrayList<Integer> arr) //bubble Sort
    {
        for(int i=0;i<arr.size()-1;i++)
        {
            for(int j=0;j<arr.size()-i-1;j++)
            {
                if((int)arr.get(j)>(int)arr.get(j+1))
                {
                    Integer temp = arr.get(j);
                   arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                } 
            }
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
        Q4 arrayobj = new Q4();
        ArrayList <Integer>arr =  new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            arr.add(scan.nextInt());
        }
        arrayobj.display(arr);
       ArrayList<Integer> obj =  arrayobj.Sort(arr);
        arrayobj.display(obj);
    
    }
    
}
