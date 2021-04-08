import java.util.Scanner;

public class Q8 {

    public static String parityCheck(StringBuilder str) {
        int size = str.length();
        String paritybit;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("1"))
                count++;
        }
        System.out.println(count);
        if (count % 2 == 0)
            paritybit = "0";
        else
            paritybit = "1";
        str.append(paritybit);

        String string = str.toString();
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder((8));
        for (int i = 0; i < 7; i++)
            sb.insert(i, sc.next());
        System.out.println(Q8.parityCheck(sb));
    }
}
