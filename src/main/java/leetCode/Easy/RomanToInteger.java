package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        s = s.replace("IV","III");
        s = s.replace("IX","VIII");
        s = s.replace("XL","XXXX");
        s = s .replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM", "DCCCC");

        int sum = 0;

        for (Character c : s.toCharArray()) {
            sum += map.get(c);
        }

        return sum;
    }
}
