/*Q8. Write a program that finds each factor of a given number n. Your solution should return an array of the number(s) that meet this criteria.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static ArrayList factorCalculator(int num)
    {
        ArrayList<Integer> factorCollection = new ArrayList<>();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            factorCollection.add(i);
        }

        return factorCollection;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Integer> list = Q8.factorCalculator(num);
        System.out.println(list);

    }
}
