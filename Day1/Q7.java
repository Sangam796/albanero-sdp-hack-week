//Q7. Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
Return the length of the longest (contiguous) subarray that contains only 1s. 
import java.util.Scanner;
public class Q7 {

    public static void main(String[] args)
    {
      int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++)
        array[i] = sc.nextInt();
        int k = sc.nextInt();
        int startCounter=0, endCounter, zeroCounter=0 ;
        int maxConsecutiveOneCount = 0;
        for(endCounter=0;endCounter<array.length;endCounter++)
        {
            if(array[endCounter]==0)
            zeroCounter++;

            while(zeroCounter>k)
            {
                if(array[startCounter]==0)
                zeroCounter--;
                startCounter++;
            }
            maxConsecutiveOneCount = Math.max(maxConsecutiveOneCount, endCounter-startCounter+1);
        }

        System.out.println(maxConsecutiveOneCount);
    }
    
}
