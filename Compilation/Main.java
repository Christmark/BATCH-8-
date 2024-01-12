/*
Palindrome 
*/
import java.util.*;
public class Main{

public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    System.out.println("**********************");
    System.out.println("**"+" Lagay ka string"+" **");
    System.out.println("**********************");
    String st1 = s.nextLine();

    String st2 = Palindrome(st1);
    if (isPalindrome(st1,st2)==true)
    {
        System.out.println("**********************");
        System.out.println("Palindrome");
        System.out.println("**********************");
    }
    else {
        System.out.println("**********************");
        System.out.println("Hindi palindrome");
        System.out.println("**********************");
    }
}

public static String Palindrome(String s) {
    StringBuilder stringBuilder = new StringBuilder(s);
    return String.valueOf(stringBuilder.reverse());
}

public static boolean isPalindrome(String s1, String s2){
    if (s1.equals(s2))
    {
        return true;
    }
    else {
        return false;
    }
}
}


