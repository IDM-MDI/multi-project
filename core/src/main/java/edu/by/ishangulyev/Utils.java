package edu.by.ishangulyev;

import java.util.Arrays;
import edu.by.ishangulyev.StringUtils;
public class Utils {
    public static boolean isAllPositiveNumbers(String... str){
        return Arrays.stream(str).allMatch(StringUtils::isPositive);
    }
}
