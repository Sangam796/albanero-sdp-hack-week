public class Q7 {

    public static void main(String[] args)
    {
        int array[]= new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int startCounter=0, endCounter, zeroCounter=0 , k =3;
        int maxConsecutiveOneCount = 0;
        for(endCounter=0;endCounter<array.length;endCounter++)
        {
            if(array[endCounter]==0)
            zeroCounter++;

            while(zeroCounter>k)
            {
                if(array[startCounter]==0)
                zeroCounter--;
                startCounter++;
            }
            maxConsecutiveOneCount = Math.max(maxConsecutiveOneCount, endCounter-startCounter+1);
        }

        System.out.println(maxConsecutiveOneCount);
    }
    
}
