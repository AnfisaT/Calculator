package CmdCalculator;

/**
 * Created by Anfisa on 23.06.2017.
 */
public class Calc {
    public double calc (String A) { //нужно сменить тип метода с void на возвращаемое значение!!
        String s = A;
        Double Res = new Double(0);
        String e = "Неверный формат введенного выражения";
        StringTest K = new StringTest();
        if(K.stringtest(s)){
           StringSplit L = new StringSplit();
           String [] ElStart = L.stringsplit(s);
           for (int i = 0; i < ElStart.length; i++){
               System.out.print(ElStart[i]);
           }
           System.out.println("");
           StringMD O = new StringMD();
           String [] ElProc = O.MD (ElStart);
           for (int i = 0; i < ElProc.length; i++){
                System.out.print(ElProc[i]);
           }
           System.out.println("");
           StringID P = new StringID();
           ElProc = P.ID(ElProc);
           for (int i = 0; i < ElProc.length; i++){
               System.out.print(ElProc[i]);
           }
           System.out.println("");
           try {
               Res = Double.valueOf(ElProc[0]);
           } catch (NumberFormatException i) {
               System.out.println ("Неверный формат строки!");
           }
        }
        else {
                System.out.println(e);
        }
        return(Res);
    }
}

