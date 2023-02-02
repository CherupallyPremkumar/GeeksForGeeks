package DynamicProgramming;

public class GameOfLife {
    public static int[][] GameofLife(int[][] arr)
    {
        int[][] arr2 = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                arr2[i][j]=arr[i][j];

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                int curentelement=arr[i][j];
                int live=checkrules(arr,i,j,0);
                if(curentelement==1)
                {
                    //  if(live>=2)
                }

            }
        }

        return arr;
    }
    public static int checkrules(int[][] arr,int row ,int col,int count)
    {

        int live=1;
        int neibour=0;
        if (arr[row][col+1] == live) {
            neibour++;
        }
        if(arr[row+1][col+1] == live) {
            neibour++;
        }
        if(arr[row+1][col] == live) {
            neibour++;
        }
        if(arr[row][col-1] == live) {
            neibour++;
        }
        if(arr[row-1][col-1] == live) {
            neibour++;
        }
        if(arr[row-1][col] == live) {
            neibour++;
        }
        if(arr[row+1][col-1] == live) {
            neibour++;
        }

        return live;
    }
}
