# Calculator
import java.util.Scanner;
public class Calculator {
    public static void main (String [] args){
        System.out.print("Введите, пожалуйста, выражение:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Calc One = new Calc();
        double result = One.calc(s);
        System.out.println(result);
    }
}
