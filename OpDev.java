package CmdCalculator;

/**
 * Created by Anfisa on 24.06.2017.
 */
public class OpDev implements Operation {
    public double op(double v1, double v2) {
        double quot;
        try{
            quot = v1 / v2; //нужно оформить через try-catch, чтобы исключить ошибку деленияна ноль!
        }catch(ArithmeticException e){
            quot = 0;
        }
        return quot;
     }
}
