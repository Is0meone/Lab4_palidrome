import java.util.*;

public class Palindrome {
    public static void main (String[] arguments) {
        String word = "abccba";
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println(word.substring(0,2));
    }
    public static String findLongestPalindrome(String word) {
        for (int i = 0; i < word.length()-1; i++) { // -1 nawet nie bo <=

        }
        return "";
    }
    public static String analyzeSubstring(String word,int dlugosc) { //dlugosc i+1
        for(int i = 0;i<word.length()-dlugosc;i++){
           if(word.substring(i,i+dlugosc)==word.substring(i+dlugosc,i+2*dlugosc)){

           }
        }
        return "";
    }
    public static boolean isPalindrome(String word) {
        return true;
    }
}
