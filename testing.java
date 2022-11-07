import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.round;

public class testing {
    public static void main(String[] args){
        Scanner u_input = new Scanner(System.in);
        String subone ,subtwo;
        String palindrome = "";

        System.out.println("Podaj slowo do sprawdzenia");
        String word = u_input.nextLine();
        final long startTime = System.currentTimeMillis();

        for(int krok = 0;krok<word.length();krok++){
         //   System.out.println("Jesteśmy w kroku "+krok);
        if(krok%2==0)
        {
            palindrome = parzyste(word,palindrome,krok);
        }
        else {
            palindrome = niepazyste(word,palindrome,krok);
        }
    }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
        System.out.println("Ostateczenie najwiekszy pal to "+ palindrome);
    }
    public static String odwracanie(String input){
        String odwrocony="";
        char ch;

        for (int i=0; i<input.length(); i++)
        {
            ch= input.charAt(i); //extracts each character
            odwrocony= ch+odwrocony; //adds each character in front of the existing string
        }

        return odwrocony;
    }
    public static String parzyste(String word,String palindrome, int krok){
        String subone ,subtwo;
        for(int i =0 ;i<word.length()-krok-1;i++)
        {
            subone = word.substring(i,i+krok/2+1);
            subtwo = word.substring(i+krok/2+1,i+krok+2);
            if(subone.equals(odwracanie(subtwo))){
                palindrome = word.substring(i,i+krok+2);
            }
        }
        return palindrome;
    }
    public static String niepazyste(String word,String palindrome, int krok){
        String subone ,subtwo;
        float pkt_start = krok;
        float flaga = krok;

        for (int i = 0; i < word.length() - krok - 1; i++) {
            subone = word.substring(i,round(pkt_start)-round(flaga/2)+1);
            subtwo = word.substring(i+krok-round(flaga/2)+2,round(krok)+round(pkt_start)-2*round(flaga/2)+3);
            if(subone.equals(odwracanie(subtwo))){
                palindrome = word.substring(i,round(krok)+round(pkt_start)-2*round(flaga/2)+3);
            }
            pkt_start++;
        }
        return palindrome;
    }
}