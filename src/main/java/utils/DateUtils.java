package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 13:58
 */
public class DateUtils {
    public static Date convertDateToStringUTC(String strDate) {
        try {
            SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd");
            return isoFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
