package Strings;

public class JavaProgramtoDeterminetheUnicodeCodePointaagivenindex {
    public static void unicodePoint(String str)
    {
        System.out.println(str.codePointAt(-1));// exception before outof Range{
         for (int i=0;i<str.length();i++)
         {
             System.out.println(str.codePointAt(i));
         }
    }
    public static void main(String[] args) {
          unicodePoint("Prem");
    }
}
