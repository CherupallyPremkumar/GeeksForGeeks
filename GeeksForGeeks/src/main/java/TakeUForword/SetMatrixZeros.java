package TakeUForword;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetMatrixZeros {



    //TimeComplexity of below program is (MXN) for finding the Zeros  { nested for Loop}
    // If the Zero is found ,make a call to makezerocouloumnzeromethod  (M+N){TWO While Loop}
    //Space Complexity is O(1) beCAUSE we are detailing with the same matrix
    public static int[][] setmatrix(int[][] matrix)
    {
        for(int i=0;i< matrix.length;i++)
        {
            for (int j = 0; j < matrix[0].length; j++) {
                  if(matrix[i][j]==0)
                  {
                      makerowandcoulmnzero(matrix,i,j);
                  }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(matrix[i][j]<0)
                    matrix[i][j]=0;
            }
        }
        return matrix;
    }
    public static int[][] makerowandcoulmnzero(int[][] matrix,int row,int column)
    {
        int i=0;
        while (i<matrix[0].length){
            if(matrix[row][i]!=0)
                matrix[row][i]=-1;

            i=i+1;
            }
        int j=0;
        while (j<matrix.length){
            if(matrix[j][column]!=0)
                matrix[j][column]=-1;

            j=j+1;
            }
        return matrix;
    }
    //for the Second approach( we are using two nested for loop so time complexity is O(M*N +M*N)
    //Space complexity will become O(N)
    public static int[][] setMatrixZeroSecondApproach(int[][] matrix)
    {

        int[] row=new int[matrix.length];
        int[] column=new int[matrix[0].length];
        for(int i=0;i< matrix.length;i++)
        {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0)
                {
                    row[i]=-1;
                    column[j]=-1;
                }
            }
        }
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if(row[i]==-1 || column[j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
    public static List<List<Integer>> pascalTraingle(int value)
    {
       List<List<Integer>> traingle=new ArrayList<>(value);
       List<Integer> row,pre=null;
       for (int i=0;i<value;i++)
       {
           row=new ArrayList<>();
           for (int j = 0; j <=i; j++) {
               if(j==0 || j==i)
               {
                   row.add(1);
               }else
               {
                   row.add(pre.get(j-1)+ pre.get(j));
               }
           }
           pre=row;
           traingle.add(row);
       }
       return traingle;
    }
 /*   public static List<Integer> pascalTraingleOnlyOneROw(int justRow)
    {
        for (int i = 0; i < justRow; i++) {

        }
    }*/
    // This approach takes O(n3) using kadanes algorithm nakes O(N)
    public static int MaximumSubarraySuminanArray(int[] nums)
    {//-2,-3,4,-1,-2,1,5,-1
        int sum=0;
        int max=Integer.MIN_VALUE;
        if(nums.length==1) return nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length -1; j++) {

                for (int k = i; k <=j; k++) {
                    sum=sum+nums[k];
                }
               max=Math.max(sum,max);
                sum=0;
            }
        }
       return max;

    }
    public static int MaximumSubarraySuminanArrayKadanesAlgorithm(int[] nums)
    {//-2,1,-3,4,-1,2,1,-5,4
        int max=Integer.MIN_VALUE , sum=0 ;
        int s=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum=0;
                s=i+1;
            }
        }

        return max;
    }
    public static void sortColors(int[] nums) {

        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {

            if(nums[left]>nums[right])
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
            }else
            {
                right--;
            }
            if((left==right))
            {
                left=left+1;
                right=nums.length-1;
            }
        }
        for (Integer n:nums) {
            System.out.println(n);
        }
    }
    public static void sortColorss(int[] nums) {


    }
    public static void pascalTraingleOnlyOneROw(int row,int coluum)
    {
        int res=1;

        res =res*(row-1);
        res=res/(coluum-1);
        System.out.println(res);
    }


    public static void main(String[] args) {
        int[][] arr1 = { { 1, 0, 3 }, { 0, 5, 6 } ,{ 1, 3, 8 },{1,2,3}};
        int[][] arr2 = new int[arr1.length][arr1.length];
        arr2=arr1;

        int[] l={2,1,0,0,1,2,1,2,0};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        sortColors(l);
       /* for (int i = 0; i < setmatrix.size(); i++) {
            List<Integer> l=setmatrix.get(i);
            for (int j = 0; j < l.size() ;j++) {
                System.out.print(l.get(j));
            }
            System.out.println(" ");
        }*/


    }
}
