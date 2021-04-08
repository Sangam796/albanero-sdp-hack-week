import java.util.Scanner;

public class Q9 {
    public static Integer squareOfNum(int num)
    {
        String squarednum = "";
        while(num!=0)
        {
            int rem= num%10;
            squarednum = (rem*rem) + squarednum;
            num/=10;
        }
        Integer result = Integer.parseInt(squarednum);
        return result;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       System.out.println(Q9.squareOfNum(num)); 
    }
}
