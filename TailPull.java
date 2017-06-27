package CmdCalculator;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class TailPull {
    public String [] tailpull(String D[], int a) {
        String P [] = D;
        int i = a;
        for (int j = i; j < (P.length - 2); j++) {
            P[j] = P[j + 2];
        }
        for (int j = P.length - 2; j < P.length; j++) {
            P[j] = "";
        }
        return (P);
    }
}
