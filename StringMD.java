package CmdCalculator;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class StringMD {
    public String [] MD (String B []){
        String Elements [] = B;
        Double c = new Double (0);
        for (int i = 0; i < Elements.length; i++) {
            switch (Elements[i]) {
                case "*":
                    OpMult X = new OpMult();
                    c = X.op(Double.valueOf(Elements[i - 1]), Double.valueOf(Elements[i + 1]));
                    Elements[i-1] = Double.toString(c);
                    TailPull A = new TailPull();
                    Elements = A.tailpull(Elements, i);
                    break;
                case "/":
                    OpDev Y = new OpDev();
                    c = Y.op(Double.valueOf(Elements[i - 1]), Double.valueOf(Elements[i + 1]));
                    Elements[i-1] = Double.toString(c);
                    TailPull C = new TailPull();
                    Elements= C.tailpull(Elements, i);
                    break;
            }
        }
        return(Elements);
    }

}
