package Strings;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printfirstletterofeachwordinastringusingregex {
    public static String firstLetterofTheCharacter(String str)
    {
   String s="p*m";
       Pattern pattern=Pattern.compile(s);
        Matcher m1=pattern.matcher(str);
        MatchResult b=m1.toMatchResult();
        System.out.println(b);
        while (m1.find())
        {
            System.out.println(m1.group());
        }
    return str;
    }
    public static void main(String[] args) {
        System.out.println(firstLetterofTheCharacter("Prem Kumar Prem "));
    }
}
