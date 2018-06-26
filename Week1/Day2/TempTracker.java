public class TempTracker {
    Integer size,sum;
    Integer max,min;
    Integer mode;
    int[] fahrenheit=new int[111];
    public TempTracker()
    {
        size=0;
        sum=0;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        mode=0;


    }
    public void insert(Integer temp)
    {
        if(temp>=0)
        {
            sum=sum+temp;
            if(max<temp)
            {
                max=temp;
            }
            if(min>temp)
            {
                min=temp;
            }
            fahrenheit[temp]++;
            if(fahrenheit[temp]>fahrenheit[mode])
            {
                mode=temp;
            }
            size++;
        }
    }
    public Integer get_min()
    {
        if(size>0)
            return min;
        else
            return null;
    }
    public Integer get_max()
    {
        if(size>0)
            return max;
        else
            return null;
    }
    public Integer get_mode()
    {
        if(size>0)
            return fahrenheit[mode];
        else
            return null;
    }
    public Double get_mean()
    {
        if(size>0)
        {
            return Double.parseDouble(sum/size+"");
        }
        else
]            return 0.0;
    }
    public static void main(String[] args) {
        TempTracker t=new TempTracker();
        t.insert(75);
        t.insert(7);
        t.insert(5);
        t.insert(2);
        t.insert(7);

        System.out.println(t.get_max());//output 75
        System.out.println(t.get_min());//output 2
        System.out.println(t.get_mode());//output 7
        System.out.println(t.get_mean());//output 19.0
    }
}
