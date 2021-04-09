//Q35. Write a program that takes an array of two numbers and determines if the sum of the digits in each number are equal to each other.
import java.util.Scanner;
public class Q5
{
    public static boolean isSumEqual(int num1, int num2)
    {
        int rem1 , rem2, sum1=0, sum2=0;
        while(num1!=0||num2!=0)
        {
            rem1 = num1%10;
            rem2 = num2%10;
            sum1+=rem1;
            sum2+=rem2;
            num1/=10;
            num2/=10;
        }
        if(sum1==sum2)
        return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(Q5.isSumEqual(num1, num2));
    }
}