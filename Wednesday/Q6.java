/*Q6. Take input, an array of positive and negative numbers. Return an array where the 
first element is the count of positive numbers and the second element is the sum of negative numbers.*/
import java.util.*;
public class Q6 {
    public ArrayList<Integer> positiveCountNegativeSum(ArrayList<Integer> arr) //bubble sort
    {
        if(arr.size()==0)
        return arr;
        int negativeSum=0 , positiveCount=0;
        for(int i=0;i<arr.size();i++)
        {
            if((int)arr.get(i)>0)
           positiveCount++;
           else if((int)arr.get(i)<0)
           negativeSum+=(int)arr.get(i);

        }
        ArrayList <Integer> listOfPositiveCountNegativeSum = new ArrayList<>(2);
        listOfPositiveCountNegativeSum.add(positiveCount);
        listOfPositiveCountNegativeSum.add(negativeSum);
        return listOfPositiveCountNegativeSum;

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
        Q6 arrayobj = new Q6();
        ArrayList <Integer>arr =  new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            arr.add(scan.nextInt());
        }
        
        arrayobj.display(arr);
       ArrayList<Integer> obj =  arrayobj.positiveCountNegativeSum(arr);
        arrayobj.display(obj);
    
    }
    
}
