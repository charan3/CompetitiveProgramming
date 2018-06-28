public class FindRotationPoint {
    public int rotationPoint(String[] words)
    {
        if(words.length==0)
            return -1;
        else if(words.length==1)
            return 0;
        else
        {
            int low=0;
            int high=words.length-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(mid!=0)
                {
                    if (words[mid - 1].compareTo(words[mid]) > 0)
                        return mid;
                }
                if(mid!=words.length-1) {
                    if (words[mid].compareTo(words[mid + 1]) > 0)
                        return mid + 1;
                }

                if(words[low].compareTo(words[mid])>0)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }


            }
            System.out.println("Sorted Array");
            return 0;

        }
    }
    public static void main(String[] args) {
        String[] words={"ptolemaic", "retrograde", "supplant", "undulate", "xenoepist", "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"};
       // String[] word={"grape", "orange", "plum", "radish", "apple"};
       // String[] w={"cape", "cake"};
        String[] a={"apple","banana","cat","dog"};
        String[] ex={"2","3","4","1"};
        FindRotationPoint r=new FindRotationPoint();
        System.out.println(r.rotationPoint(words));//5
       System.out.println(r.rotationPoint(a));//0
        System.out.println(r.rotationPoint(ex));//3


    }
}
