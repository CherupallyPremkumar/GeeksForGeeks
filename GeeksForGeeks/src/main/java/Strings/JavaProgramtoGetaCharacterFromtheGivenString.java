package Strings;

public class JavaProgramtoGetaCharacterFromtheGivenString {

    public static char findcharWithIndex(String str,int  index )
    {
        return str.charAt(index);
    }
    public static char findcharWithtoCharArray(String str,int  index )
    {
        char[] ch=str.toCharArray();
        return ch[index];
    }
    public static char findcharWithStreams(String str,int  index )
    {
        return (char) str.chars().mapToObj(a->(char)a).toArray()[index];
    } public static char findcharWithCodePoint(String str,int  index )
    {
        return (char) str.codePointAt(index);
    }public static char findcharWithGetChars(String str,int  index )
    {
        char[] c=new char[0];
        str.getChars(index,index+1,c,0);
        return c[0];
    }


    public static void main(String[] args) {
        System.out.println(findcharWithStreams("prem",2));
    }
}
