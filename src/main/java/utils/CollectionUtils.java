package utils;

import java.util.Collection;
import java.util.Collections;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:50
 */
public class CollectionUtils {
    public static boolean isNullOrEmpty(Collection<?> list) {
        return list == null || list.isEmpty();
    }
}
