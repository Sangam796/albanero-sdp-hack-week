//Q2.Maximum Nesting Depth of the Parentheses
import java.util.*;
import java.util.Stack;

public class Q2 {

    public static void VPS(String inputString)
    {
        char poppedchar;
        Stack stringStack = new Stack();
        int top=-1;
        int max_depth = 0, countpushpop=0;
        for (int i = 0; i < inputString.length(); i++) {

            if ( inputString.charAt(0) == ')' ) 
            {
                top = 0;
                break;
            }
            char c = inputString.charAt(i);
            if (c =='(') 
            {
                top++;
                if (top < 0) {
                    top = 0;
                    break;
                }
                stringStack.push(c);
                countpushpop++;
            }
            if ( c == ')') {
                if (top < 0) 
                {
                  top = 0;
                    break;
                }
                
                stringStack.pop();
                countpushpop--;
                top--;
            
             
            }
            max_depth = Math.max(countpushpop,max_depth);
        }
       
        if (top == -1)
        System.out.println(max_depth);
        else
            System.out.println("Invalid VPS");
            
    }


    

   
    public static void main(String[] argh) 
    {
        
        Scanner sc = new Scanner(System.in);
       
      
            String inputString = sc.next();
            Q2.VPS(inputString);
    }
            
}
