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
            System.out.println("Строка начинается и заканчивается числом");
            if (mat2.matches()) {
                System.out.println("Строка соответсвует шаблону");
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
