//Q1. Generate a String With Characters That Have Odd Counts

public class Q1 {

    public String oddString(int n)
    {
        String str = "";
        
        for(int i=0;i<n;i++)
        {if(n%2==0&&i==n-1)//if n is even string should be (n-1)number of p and one z = pppz this line will print z at the last iteration only
            {
                str+='z';
            }
            else
    str+='p';
    }
    return str;
}
    

    public static void main(String[] args)
    {
        Q1 strgeneratorObj = new Q1();
        int n=4;
        System.out.println(strgeneratorObj.oddString(n));

    }
    
}
