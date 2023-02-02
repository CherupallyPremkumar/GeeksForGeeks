package Strings;

public class JavaProgramtoRemoveleadingZeros {
    public static String removeLeading(String str)
    {
        int i=0;
        while(i<str.length() && str.charAt(i)=='0') i++;
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.replace(0,i,"");
        return new String(stringBuilder);
    }
    public static String removeLeadingSubString(String str)
    {
        int i=0;
        while(i<str.length() && str.charAt(i)=='0') i++;
        return str.substring(i,str.length());
    }

    public static void main(String[] args) {
        System.out.println(removeLeadingSubString("00001234567"));
    }
}
