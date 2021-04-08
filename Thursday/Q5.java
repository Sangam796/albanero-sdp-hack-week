import java.util.Scanner;
public class Q5 {
    public static boolean isIsogram(int charFrequency[], char charArray[])
    {
    for(int i=0;i<charArray.length;i++)
    {
        charFrequency[charArray[i]-97]++; //countts the frequency of alphabet from a-z
    }
    boolean isIsogram = false;
    for(int i=0;i<charFrequency.length;i++)
    {
        if(charFrequency[i]>1)
        return false;
    }
    return true;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int charFrequency[] = new int[26];
        char charArray[] = str.toCharArray();
        System.out.println(Q5.isIsogram(charFrequency, charArray));
    }
    
}
