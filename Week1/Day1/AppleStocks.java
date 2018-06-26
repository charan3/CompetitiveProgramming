public class AppleStocks {


    public static int getMax(int[] arr)
    {
        int min=arr[0];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int max=arr[i]-min;
            min=Math.min(min,arr[i]);
            if(max>ans)
            {
                ans=max;
            }
        }
        return ans;
    }




    public static void main(String[] args) {
        int[] stockPricesYesterday = {10, 7, 5, 8, 11, 9};
        int[] case1={1,2,3,4};
        int[] case2={100, 200, 300, 200, 100, 50, 200, 500};
        int[] case3={4, 3, 2, 1};
        int[] case4={100,200,300,200,100,50};



        System.out.println(getMax(stockPricesYesterday));
        System.out.println(getMax(case1));
        System.out.println(getMax(case2));
        System.out.println(getMax(case3));
        System.out.println(getMax(case4));


    }
}
