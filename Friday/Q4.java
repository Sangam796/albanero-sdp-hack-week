import java.util.Scanner;

//The digit distance between two numbers is the total value of the difference between each pair of digits.
public class Q4
{
    public static int distance(int num1, int num2)
    {
        int rem1 , rem2, distance =0;
        int diff=0;
            String countdigit1 = "";
            String countdigit2= "";
            countdigit1= countdigit1.valueOf(num1);
            countdigit2 = countdigit2.valueOf(num2);
            
            if(countdigit1.length()!=countdigit2.length())
            {
                System.out.println("Given numbers length is different.");
                System.exit(0);
            }
            
        while(num1!=0)
        {
            rem1 = num1%10;
            rem2 = num2%10;
            diff = Math.abs(rem1-rem2);
            distance+=diff;
            num1/=10;
            num2/=10;
        }
        return distance;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(Q4.distance(num1, num2));
    }
}