package DynamicProgramming;

public class KnapsnackRecursive {
    static int max(int a, int b) { return Math.max(a, b);
    }

    public static int maximunprofit(int[] values,int[] weight,int n,int w)
    {
       if(n==0 || w==0)
           return 0;


       if(weight[ n-1]>w)
           return maximunprofit(values,weight,n-1,w);
       else
           return max(values[n - 1] + maximunprofit(values ,weight,n - 1,w - weight[n - 1]), maximunprofit(values,weight, n - 1,w));
    }
    public static int maximunprofitDP(int[] values,int[] weight,int n,int w)
    {
     //Input: N = 3, W = 4
        //values[] = {1,2,3}
        //weight[] = {4,5,1}
        int max=0;
        for(int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                if(n==0 ||w==0)
                {
                    return 0;
                }
                if(weight[j]<=w)
                {
                  max=max+values[j];
                  w=w-weight[j];
                }else
                {
                }
            }
        }
          return 0;
    }

    public static void main(String[] args) {
        int N = 5, W = 50 ;
        int[] values = {60,110,120,32,66};
        int[] weight = {10,20,30,15,33};
        System.out.println(Solution.longestPalindrome("babad"));
    }
}
class Solution {
    public static String longestPalindrome(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        String ans="";
        int maxLength=0;
        for(int gap=0;gap<s.length();gap++){
            for(int i=0,j=gap;j<s.length();i++,j++){
                if(gap==0){
                    dp[i][j]=true;
                }else if(gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }
                if(dp[i][j]){
                    if(j-i+1>maxLength){
                        maxLength=j-i+1;
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
}