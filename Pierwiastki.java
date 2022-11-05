import java.lang.Math;
import java.util.Scanner;

public class Pierwiastki {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        Scanner three = new Scanner(System.in);
        System.out.println("Jaką funkcje chcesz policzyć wybierz 1 jesli liniowa i 2 jesli kwadratowa");
        int choise = sc.nextInt();
        switch (choise){
            case 1:
                float al = one.nextInt();
                float bl = two.nextInt();
                calculateRoot(al,bl);
                break;
            case 2:
                float as = one.nextInt();
                float bs = two.nextInt();
                float cs = three.nextInt();
                if(as==0) calculateRoot(bs,cs);
                else calculateRoots(as,bs,cs);
                break;
        }
    }

    public static void calculateRoots(float a, float b, float c) {
        double delta = b*b-(4*a*c);
        if(delta<0){
            System.out.println("Ta funkcja nie ma miejsc zerowych ");
        }
        else if(delta == 0){
            System.out.println("Pierwiastek to "+(-b)/(2*a));
        }
        else{
            double sdelta = Math.sqrt(delta);
            System.out.println("Pierwszy pierwiastek to " + (-b+sdelta)/(2*a));
            System.out.println("Drugi pierwiastek to " + (-b-sdelta)/(2*a));
        }
    }
    public static void calculateRoot(float a, float b) {
    System.out.println("Pierwiastek to " + -b/a);
    }

}
