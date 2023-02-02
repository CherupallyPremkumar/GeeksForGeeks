package Strings;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class JavaProgramtoReverseaString {
    public static String reverseaStringusingString(String str)
    {
        String str1="";
       for (int i=0;i<str.length();i++)
       {
           char ch=str.charAt(i);
           str1=ch+str1;
       }
       return str1;
    }
    public static String reverseaStringusingBytes(String str)
    {
        byte[] bytes=str.getBytes(StandardCharsets.UTF_8);
        byte[] result=new byte[bytes.length];
       for (int i=bytes.length-1, j=0;i>0;i--,j++)
       {
          result[j]=bytes[i];

       }
       return new String(result);
    }
public static String reverseaStringusingStringBuilder(String str)
    {
        StringBuilder stringBuilder=new StringBuilder(str);
        return new String(stringBuilder.reverse());
    }
    public static String reverseaStringusingArrayList(String str)
    {
        String str1="";
        List<Character> list=new ArrayList<>();
        for (int i=0;i<str.length();i++)
        {
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        System.out.println();
        for(char c: list)
        {
            str1+=c;
        }
        return str1;
    }
    public static String reverseaStringusingStack(String str)
    {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
        String str1="";
        while(!stack.isEmpty())
        {
            str1+=stack.pop();
        }
        return str1;
    }


    public static void main(String[] args) {
        System.out.println(reverseaStringusingStack("Premkumar ch"));
    }
}
