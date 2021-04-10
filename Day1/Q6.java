//Q6. In mathematics, an Arithmetic Progression (AP) is a sequence of numbers such that the difference between the consecutive terms is constant. Write a program that takes three arguments:
import java.util.Scanner;
import java.util.ArrayList;
public class Q6 {
    int diff, n, first;
    public Q6(int d, int total, int first)
    {
        diff = d;
        n= total;
        this.first = first;
    }

    public ArrayList ArithmeticProgration()
    {
        ArrayList<Integer> AP  = new ArrayList<>(n);
        int j=0;
        for(int i=1;i<=n;i++)
        {
            int item = first+((i-1)*diff);
            AP.add(j,item);
            j++;
        }
        
        String sb = new String();
        for (int i =0; i<AP.size();i++) {
            if(i==AP.size()-1)
          sb+=String.valueOf(AP.get(i))+" ";
          else
          sb+= String.valueOf(AP.get(i)+" , ");
        }
        System.out.println("The number string = " + sb);
        
        return AP;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int difference, total, firstTerm, queries;
        System.out.println("Enter the number of queries.");
        int k=1;
        queries = sc.nextInt();
        while(queries!=0)
        {
            System.out.println("Please provide details for query "+ k);
        System.out.println("Enter total numbers of terms.");
        total = sc.nextInt();
        System.out.println("Enter the value for first term");
        firstTerm =  sc.nextInt();
        System.out.println("Enter Difference between two consecutive terms.");
        difference = sc.nextInt();
        Q6 APobj1 = new Q6(difference, total, firstTerm);
        ArrayList<Integer> sequence = APobj1.ArithmeticProgration();
        for(Integer s : sequence)
        {

        }
        queries--;
        k++;
        }


    }
}
