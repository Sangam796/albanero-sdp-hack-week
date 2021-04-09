import java.util.ArrayList;
import java.util.Scanner;


public class Q2 {
    public static ArrayList<Integer> uniqueElement(ArrayList <Integer> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            for(int j=arr.size()-1;j>i;j--)
            {
                if(arr.get(i)==arr.get(j))
                arr.remove(j);
            }
        }
       System.out.println(arr);
       return arr;
    }
     public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList();
         Scanner sc = new Scanner(System.in);
         for(int i=0;i<10;i++)
         arr.add(sc.nextInt());
         System.out.println(arr);
         Q2.uniqueElement(arr);

     }
    
}
