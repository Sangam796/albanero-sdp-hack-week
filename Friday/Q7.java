import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {

    public  int equivalentBinary(int num)
    {
        ArrayList<Integer>  binequivalent = new ArrayList();
        int index = 0;
        int count = 0;
        if(num==0)
        {
            count=0;
            return count;
        }
        while(num!=0)
        {
            int rem = num%2;
            binequivalent.add(index,rem);
            num/=2;
        }
        
        
        for(Integer i : binequivalent)
        {
            if(i==1)
            count++;

        }
        return count;
    }

    public  ArrayList<Integer> countOnes(int range)
    {
        ArrayList<Integer> countBinOne = new ArrayList();
        
        for(int i=0;i<=range;i++)
        {
            countBinOne.add(equivalentBinary(i));
        }
        return countBinOne;
    }
  
    public static void main(String[] args) {
        int num;
        Q7 obj = new Q7();
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println(obj.countOnes(num)); 
    }
    
}
