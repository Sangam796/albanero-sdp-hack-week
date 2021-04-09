import java.util.Scanner;

public class Q10 {

    public static boolean isSubsequence(String str1, String str2)
    {
        int positionChecker[] = new int[str1.length()];
        int i=0, index=0;
        while(i<str1.length())
        {
            String str = str1.substring(i, i+1);
            if(str2.contains(str))
            {
            positionChecker[index++] = str2.indexOf(str);
            }
            else
            return false; //if any of the character in string1 is not present in string2
            i++;

        }
        int checkAscendingOrder = 0;
        for(i=0 ;i<positionChecker.length-1;i++)
       {
           if(positionChecker[i]>positionChecker[i+1])
           checkAscendingOrder=1;
       }
        if(checkAscendingOrder==1)
        return false;
        return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Parent string");
        String str1 = sc.nextLine();
        System.out.println("Enter the subsequent string");

        String str2 = sc.nextLine();
        System.out.println(Q10.isSubsequence(str2, str1));
    }
    
}
