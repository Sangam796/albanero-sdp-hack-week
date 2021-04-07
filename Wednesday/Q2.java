import java.util.*;
public class Q2 {

    public String incrDecrString(String str)
    {
        int[] charFreq = new int[26];// to know the frequency of characters a-z
        StringBuilder resultString = new StringBuilder();

        for(char c: str.toCharArray())
        {
            charFreq[c-97]++; //if c='a'(Ascii=97) then charFreq[97-97]=charFreq[0], if c='b'charFreq[1] and so on
        }

        while(resultString.length()<str.length())
        {
            sortString(resultString, charFreq, true); //for forward traversing
            sortString(resultString, charFreq, false); //for backward traversing
        }
        return  resultString.toString();
    }

    public void sortString(StringBuilder resultString, int charFreq[], boolean order)
    {
        for(int i=0;i<charFreq.length;i++)
        {
            int j = order?i:25-i; //boolean order will decide the index to be followed 
            if(charFreq[j]>0) 
            {
                resultString.append((char)(j+'a')); 
                charFreq[j]--;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        Q2 string1 = new Q2();
        System.out.println(string1.incrDecrString(s));
    }
}


