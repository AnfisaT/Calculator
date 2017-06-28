package CmdCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class StringTest {
    public boolean stringtest(String a) {
        String S = a;             //чтобы по итогам работы программы в класс Calculation вернулся ответ
        Pattern pat1 = Pattern.compile("^(\\d+(\\.\\d+)?\\s).*(\\d+(\\.\\d+)?)$");
        Matcher mat1 = pat1.matcher(S);
        Pattern pat2 = Pattern.compile("(\\d+(\\.\\d+)?\\s[-+/*]\\s)+(\\d+(\\.\\d+)?)");
        Matcher mat2 = pat2.matcher(S);
        boolean stt;
        if (mat1.matches()) {
           if (mat2.matches()) {
                stt = true;
            }
            else{
                stt = false;
            }
        }
        else{
            stt = false;
        }
        return (stt);
    }
}
