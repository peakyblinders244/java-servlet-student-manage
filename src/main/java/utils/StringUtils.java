package utils;

import java.util.List;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:46
 */
public class StringUtils {
    public static boolean isBlankOrNull(String str) {
        return str == null || str.isEmpty();
    }

    public static String join(List<Integer> ids, String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer id : ids) {
            stringBuilder.append(id).append(s);
        }
        return stringBuilder.toString();
    }
}
