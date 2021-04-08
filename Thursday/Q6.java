import java.util.Scanner;
public class Q6 {
    public static boolean isRepDig(int num)
    {
        if(num==0)
        return true;
        int rem, temp = num%10;
        num= num/10;
        int flag =0;
        while(num>=0)
        {
            rem = num%10;
            if(temp==rem) //if previous remainder and existing remainder are equal.
           flag=1;
           else
          { flag=0;
            break;
          }
            temp=rem;
            if(num==0)
            break;
            num = num/10;
            
        }
       if(flag==0)
       return false;
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(Q6.isRepDig(num));
    }
}
