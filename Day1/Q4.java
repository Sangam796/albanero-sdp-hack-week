//Q4. Add 1 to every element in the given array.
import java.util.Scanner;
public class Q4
{

    public  void putElement(int arrayElements[], int size)
    {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            arrayElements[i] = scan.nextInt();
        }
    }
    public  void displayElement(int arrayElements[], int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arrayElements[i]+" ");
        }
        System.out.println();
    }

    public int[] addOneInElements(int arrayElements[], int size)
    {
        for(int i=0;i<size;i++)
        {
            arrayElements[i]+=1;
        }
        return arrayElements;

    }

    public static void main(String [] args)
    {
        int size;
        System.out.println("Enter the size of an array.");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        if(size==0)
        {
            System.out.println("Opps you provided the size 0, no element can be inserted.");
        }
        else
        {
            Q4 arrayObj = new Q4(); //declaring object of Q4 class
            System.out.println("Enter the elements in an array.");
            int arrayElements[] = new  int[size];
            arrayObj.putElement(arrayElements, size); //input arrray

        System.out.println("Elements in an array are:");
        arrayObj.displayElement(arrayElements, size);  //displaying array

        arrayObj.addOneInElements(arrayElements, size); //callling method which add one to every element in an array
        System.out.println("After Adding 1 to every element,\nElements in an array are:");

        arrayObj.displayElement(arrayElements, size);  //displaying array

        
        }

    }
}
