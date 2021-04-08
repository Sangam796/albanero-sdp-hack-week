import java.util.Scanner;
public class Q10 {
    public static int calculateAverage(int num)
    {
       
        int rem,sum=0,count=0;
        while(num!=0)
        {
            rem=num%10;
            sum+=rem;
            count++;
            num/=10;
        }
        if(count==0) //this occurs when user enters all the zero values
        throw new ArithmeticException();
        return (sum/count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
        System.out.println(Q10.calculateAverage(num));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero exception occured.");
            e.printStackTrace();
        }
    }
    
}
