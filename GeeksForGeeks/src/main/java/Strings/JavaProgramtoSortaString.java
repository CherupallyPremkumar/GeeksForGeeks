package Strings;

import java.util.Arrays;
import java.util.Comparator;

public class JavaProgramtoSortaString {
    public static String sort(String str)
    {
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            for (int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                    char temp;
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return new String(c);
    }
    public static String sortusingInbuiltMethod(String str)
    {
        char[] c=str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    //Sorting using new Comparator
    public static String sortUsingComparatr(String str) {
        Character[] c = new Character[str.length()];
        for (int i=0;i<str.length();i++)
        {
            c[i]=str.charAt(i);
        }
        Arrays.sort(c, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Character.compare(Character.toLowerCase(c1),Character.toLowerCase(c2));
            }
        });
        //This is the firstCase to take value from the Array and Concating the value to the string
        //public int compare(Object o1, Object o2) {}
        //have to return -ve if o1 has to come before o2
        //have to return +ve if o1 has to come after o2
        //have to return 0 if o1 is equal to o2
       str="";
       for (Character c1: c)
       {
           str+=c1;
       }
        //This is the first CASE  to take value we are not changing char value to primitive
     /*   StringBuilder stringBuilder=new StringBuilder();
        for (Character c1: c)
        {
            stringBuilder.append(c1);
        }*/
       return str;
    }

    public static void main(String[] args) {
        System.out.println(sortUsingComparatr("Premkumar"));
    }
}
