public class MaxProduct3 {
    public static int maxProduct(int[] arr){
        if(arr.length<3)
        {
            return -1;
        }
        else
        {
            int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
            int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>max1)
                {
                    max3=max2;
                    max2=max1;
                    max1=arr[i];
                }
                else if(arr[i]>max2)
                {
                    max3=max2;
                    max2=arr[i];
                }
                else if(arr[i]>max3)
                {
                    max3=arr[i];
                }
                if(arr[i]<min1)
                {
                    min2=min1;
                    min1=arr[i];
                }
                else if(arr[i]<min2)
                {
                    min2=arr[i];
                }
            }
            return Math.max(min1*min2*max1,max1*max2*max3);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,-4,3,-6,7,0};
        int max=maxProduct(arr);
        if(max==-1)
        {
            System.out.println("No answer");
        }
        else
        {
            System.out.println(max);
        }
    }
}
