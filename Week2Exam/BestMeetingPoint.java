import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BestMeetingPoint {
    public static int distance(int[][] arr,int rows,int cols)
    {
        int dist=0;
        ArrayList<Integer> xpos=new ArrayList<>();
        ArrayList<Integer> ypos=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j]==1)
                {
                    xpos.add(i);
                    ypos.add(j);
                    pos.add(i);
                    pos.add(j);
                }
            }
        }

        Collections.sort(xpos);
        Collections.sort(ypos);
        if(xpos.size()+ypos.size()>=2) {
            int x = xpos.get(xpos.size() / 2);
            int y = ypos.get(ypos.size() / 2);
            // System.out.println(x);
            //System.out.println(y);
            int index = 0;

            while (index < pos.size() - 1) {
                dist += Math.abs(x - pos.get(index));
                dist += Math.abs(y - pos.get(index + 1));
                index = index + 2;
            }
        }
        return dist;
    }
    public static void main(String[] args)
    {
       int grid [][] = {{1, 0, 0, 0, 1},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0}};

        System.out.println(distance(grid,grid.length,grid[0].length));
      int  grid1 [][] = {{1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0},
                {0, 1, 1, 0, 0}};
        System.out.println(distance(grid1,grid1.length,grid1[0].length));
       int  grid2 [][] = {{1, 1},
                {1,1}};
        System.out.println(distance(grid2,grid2.length,grid2[0].length));
        int grid3 [][] = {{0, 0},
                {0, 0}};
        System.out.println(distance(grid3,grid3.length,grid3[0].length));

        int grid4 [][]={{1, 0},
                {0, 0}};
        System.out.println(distance(grid4,grid4.length,grid4[0].length));

    }
}
