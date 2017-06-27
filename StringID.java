package CmdCalculator;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class StringID {
    public String [] ID (String D []){
        String E [] = D;
        Double d = new Double(0);
        while (E[1] != ""){
            switch (E[1]) {
                case "+":
                    OpInc F = new OpInc();
                    d = F.op(Double.valueOf(E[0]), Double.valueOf(E[2]));
                    E[0] = Double.toString(d);
                    TailPull H = new TailPull();
                    E = H.tailpull(E, 1);
                    break;
                case "-":
                    OpDec G = new OpDec();
                    d = G.op(Double.valueOf(E[0]), Double.valueOf(E[2]));
                    E[0] = Double.toString(d);
                    TailPull I = new TailPull();
                    E = I.tailpull(E, 1);
                    break;
            }
        }
        return (E);
    }
}
