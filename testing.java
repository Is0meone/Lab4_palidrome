import static java.lang.Math.abs;
import static java.lang.Math.round;

public class testing {
    public static void main(String[] args){
        String word = "0110";
        String subone ,subtwo, palindrome;
        for(int krok = 0;krok<word.length();krok++){
            System.out.println("Jesteśmy w kroku "+krok);
        if(krok%2==0)
        {
            for(int i =0 ;i<word.length()-krok-1;i++)
            {
                subone = word.substring(i,i+krok/2+1);
                subtwo = word.substring(i+krok/2+1,i+krok+2);
                if(subone.equals(subtwo)){
                    palindrome = word.substring(i,i+krok+2);
                    System.out.println(palindrome);
                }

           System.out.println(" ");
            }
        }
        else {
            System.out.println("Jestem tu");
            float pkt_start = krok;
            float flaga = krok;
            for (int i = 0; i < word.length() - krok - 1; i++) {
                //System.out.println(word.substring(i,round(pkt_start)-round(flaga/2)+1)); //0,1
                //System.out.println(word.substring(i+krok-round(flaga/2)+2,2+round(krok)+round(pkt_start)-2*round(flaga/2)+1));//1,1 a ma byc 2,3
                //System.out.println(" ");
                pkt_start++;
            }
        }
    }
    }
}
