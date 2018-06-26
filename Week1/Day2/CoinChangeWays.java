import java.util.Arrays;

public class CoinChangeWays {
    public static int  noOfWays(int[] denom,int money)
    {
        int[] cways=new int[money+1];
        cways[0]=1;
        for(int i=0;i<denom.length;i++)
        {
            for(int j=denom[i];j<cways.length;j++)
            {
                cways[j]=cways[j]+cways[j-denom[i]];
            }
            System.out.println(Arrays.toString(cways));
        }
        return cways[cways.length-1];
    }
    public static void main(String[] args) {
        int denom[] = {1,2,3};
        int amount = 5;
        System.out.println(noOfWays(denom,amount));// Output 5

    }
}
