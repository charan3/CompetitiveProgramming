import java.util.Arrays;

public class CountingBits {
    public static int oneCount(int num)
    {
        int count=0;
        while(num!=0)
        {
            if(num%2!=0)
                count++;
            num/=2;
        }
        return count;
    }
    public static void countBits(int num)
    {
        int[] arr=new int[num+1];
        for(int i=1;i<=num;i++)
        {
            arr[i]=oneCount(i);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static  void main(String[] args)
    {
        int[] a={15,16,1,25,5,6};
        for(int i=0;i<a.length;i++)
        {
            countBits(a[i]);
        }
    }
}
