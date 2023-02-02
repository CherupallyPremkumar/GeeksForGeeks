package Strings;

public class SwappingPairsofCharactersinaStringinJava {
    //Input: str = “Java”
    //
    //Output: aJav

    //Input: str = “GeeksForGeeks”
    //
    //Output: eGkeFsroeGkes
    public static char[] swap(char[] ob,int left ,int right)
    {
        char temp;
        temp=ob[left];
        ob[left]=ob[right];
        ob[right]=temp;
        return ob;
    }
    public static String swappingPairsofCharactersinaString(String str)
    {
        char[] c=str.toCharArray();

        int left=0;
        int right=left+1;
        while(left<right)
        {
            if(right<c.length)
            {
                swap(c,left,right);
            }
            else
            {
                return new String(c);
            }
            left=left+2;
            right= right+2;
        }
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        System.out.println(swappingPairsofCharactersinaString("GeeksForGeeks"));

    }
}
