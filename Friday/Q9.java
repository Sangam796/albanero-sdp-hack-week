import java.util.Scanner;
 
class Q9 {
 
    public static int sumOfMaxSubArray(int arr[], int size)
    {
    int max_till_now = arr[0];
    int current_max_num = arr[0];
 
    for (int i = 1; i < size; i++)
    {
        current_max_num = Math.max(arr[i], current_max_num+arr[i]);
        max_till_now = Math.max(max_till_now, current_max_num);
    }
    return max_till_now;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();
    System.out.println("Maximum contiguous sum is " + Q9.sumOfMaxSubArray(arr, size));
    }
}