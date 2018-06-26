import java.util.Arrays;

public class ProductOtherNumbers {
    public static int[] getProductsOfAllIntsExceptAtIndex(int arr[])
    {
        int[] arr1=new int[arr.length];
        int[] arr2=new int[arr.length];
        arr1[0]=1;
        int mul=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr1[i]=mul;
            mul=mul*arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        int[] revarr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            revarr[(arr.length-1)-i]=arr[i];

        }

        mul=revarr[0];
        revarr[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            int m=revarr[i];
            revarr[i]=mul;
            mul=mul*m;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            arr2[i]=revarr[(arr.length-1)-i];

        }
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=arr1[i]*arr2[i];
        }


        return arr1;
    }
    public static void main(String[] args) {
        int arr[]={1,7,2,8};
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(arr)));

    }
}
