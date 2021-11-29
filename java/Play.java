import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.LinkedHashSet;

class st {

    public static Integer age;
    public static String name;    
}
public class Play{

    public static String getStringInBangla(String string) {
        Character[] bangla_number = {'০', '১', '২', '৩', '৪', '৫', '৬', '৭', '৮', '৯'};
        Character[] eng_number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder values = new StringBuilder();
        char[] character = string.toCharArray();
        for (char value : character) {
            char c = ' ';
            for (int j = 0; j < eng_number.length; j++) {
                if (value == eng_number[j]) {
                    c = bangla_number[j];
                    break;
                } else {
                    c = value;
                }
            }
            values.append(c);
        }
        return values.toString();
    }

    public static String converter(String numbers){
        String banglaNumbers = "০১২৩৪৫৬৭৮৯";
        String convertedNumber = "";
        for(int i=0; i<numbers.length(); i++){
            convertedNumber += banglaNumbers.charAt((int)numbers.charAt(i) - 48);
        }

        return convertedNumber;
    }
    public static void main(String[] args) {
    
        // System.out.println(getStringInBangla("12122"));
        System.out.println(converter("12122"));
    }
}