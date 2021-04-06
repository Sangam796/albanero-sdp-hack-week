public class Q8 {

    public static int minIndex(int array[])
    {
        int index=0;
        int minvalue = array[0];
        for(int i=1;i<5;i++)
        if(minvalue>array[i])
        {  index =i;
            minvalue = array[i];
        }
        return index;
    }

    public static int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];

        return sum;
    }
    public static void main(String[] args)
    {

        int array[] = new int[]{9,-1,0,4,5};
int min ;
int k=2;
while(k>0)
{
  min  = Q8.minIndex(array);
    array[min] = - array[min];
    k--;
}
        System.out.println(Q8.sum(array));
    }
    
}
