package CmdCalculator;

import java.util.regex.Pattern;

/**
 * Created by Anfisa on 26.06.2017.
 */
public class StringSplit {
    public String [] stringsplit(String b){
        String T = b;
        Pattern pat3 = Pattern.compile("\\s");
        String[] Parts = pat3.split(T);
        return (Parts);
    }
}
