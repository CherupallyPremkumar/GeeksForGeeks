package Strings;

public class JavaProgramtoReplaceaCharacterataSpecificIndex {
    public static String replaceaCharacterataSpecificIndexSubString(String str,int index,char ch)
    {
        str=str.substring(0,index) + ch +str.substring(index+1);
        return str;
    }
    public static String replaceaCharacterataSpecificIndexStringBuilder(String str,int index,char ch)
    {
       StringBuilder stringBuilder=new StringBuilder(str);
       stringBuilder.setCharAt(index,ch);

       return  new String(stringBuilder);
    }
    public static String replaceaCharacterataSpecificIndexStringBuffer(String str,int index,char ch)
    {
       StringBuffer stringBuffer=new StringBuffer(str);
       stringBuffer.setCharAt(index,ch);

       return  new String(stringBuffer);
    }

    public static void main(String[] args) {
        System.out.println(replaceaCharacterataSpecificIndexStringBuilder("prel kumar",3,'m'));
    }
}
