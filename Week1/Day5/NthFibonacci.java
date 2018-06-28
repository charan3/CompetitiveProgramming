/*
 if we n times multiply the matrix M = {{1,1},{1,0}} to itself (in other words calculate power(M, n )),
 then we get the (n+1)th Fibonacci number as the element at row and column (0, 0) in the resultant matrix.

 */

public class NthFibonacci {
    public static void multiply(int F[][], int M[][])
    {
        int x =  F[0][0]*M[0][0] + F[0][1]*M[1][0];
        int y =  F[0][0]*M[0][1] + F[0][1]*M[1][1];
        int z =  F[1][0]*M[0][0] + F[1][1]*M[1][0];
        int w =  F[1][0]*M[0][1] + F[1][1]*M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
    public static void power(int F[][],int n)
    {
        if(n==0||n==1)
            return;
        int M[][]={{1,1},{1,0}};
        power(F,n/2);
        multiply(F,F);

        if(n%2!=0)
        {
            multiply(F,M);
        }

    }
    public static int fib(int n)
    {
        int F[][]={{1,1},{1,0}};
        if(n==0)
            return 0;
        power(F,n-1);
        return F[0][0];
    }
    public static void main(String[] args) {

        System.out.println(fib(5));
        System.out.println(fib(2));
        /*
        for(int i=0;i<20;i++)
        {
            System.out.print(fib(i)+",");

        }
        */
    }
}
