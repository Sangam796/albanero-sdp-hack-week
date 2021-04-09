import java.util.Scanner;

public class Q3 {

    public String[] CapitalizeFirstChar(String[] namelist)
    {
        int firstcharIndext = 0;
        for(int i=0;i<namelist.length;i++)
        {
            namelist[i] = namelist[i].substring(firstcharIndext,firstcharIndext+1).toUpperCase() + namelist[i].substring(firstcharIndext+1).toLowerCase();
        }
        return namelist;
    }
    
    public static void main(String[] args) {
        Q3 stringobj = new Q3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] strlist = new String[n];
        for(int i=0;i<n;i++)
        strlist[i] =  sc.nextLine();       
        for(String name : stringobj.CapitalizeFirstChar(strlist))
        System.out.print(name+" ");
        System.out.println();
    }
}
