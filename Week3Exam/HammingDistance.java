public class HammingDistance {
    public static int distance(int x,int y)
    {
        int dist=0;
        int rem1,rem2;
        while(x!=0||y!=0)
        {
            rem1=x%2;
            rem2=y%2;
            x=x/2;
            y=y/2;
            if(rem1!=rem2)
            {
                dist++;
            }
        }
        return dist;
    }
    public static void main(String[] args)
    {
        int x[]={25,1,25,100,1,0};
        int y[]={30,4,30,250,30,255};
        for(int i=0;i<x.length;i++)
        System.out.println(distance(x[i],y[i]));

    }
}
