package CmdCalculator;

/**
 * Created by Anfisa on 24.06.2017.
 */
public class OpDec implements Operation {
    public double op (double v1, double v2) {
        double res = v1-v2;
        return res;
    }
}