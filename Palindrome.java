import java.util.*;
public class Palindrome {
    public static int index;
    public static void main (String[] arguments) {
        final long startTime = System.currentTimeMillis();
        String word = "bcdaaaabcd";
        int index = word.length();
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println(longestPalindrome);
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
    public static String findLongestPalindrome(String word) {
        String longestPalindrome = "";
        for (int i = 0; i < word.length(); i++) {
            String current = "";
            String subword = word.substring(i,word.length());
            index = subword.length();
            String temp = analyzeSubstring(subword);
            current = temp.substring(0,index);
            if(longestPalindrome.length()<current.length()){
                longestPalindrome = current;
            }
        }
        return longestPalindrome;
    }
    public static String analyzeSubstring(String word) {
        String substring = "";
        while(index > 0){
            substring = word.substring(0,index);
            if(isPalindrome(substring)){
                return substring;
            };
        }
        return substring;
    }
    public static boolean isPalindrome(String word) {

        int i1 = 0;
        int i2 = word.length();
        boolean isPalindrome = true;
        while(i2 > i1){
            if(word.charAt(i1)!=word.charAt(i2-1)){
                isPalindrome = false;
                break;
            }
            i1 = i1 + 1;
            i2 = i2 - 1;
        }
        if(!isPalindrome){
            index = index - 1;
        }

        return isPalindrome;
    }
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}

