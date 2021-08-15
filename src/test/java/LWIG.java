import java.time.*;
import java.time.format.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

public class LWIG {

    public static boolean isValidDate(String month, String date) {
        boolean isValid = false;
        try {/*DateTimeFormatterBuilder*/
            DateTimeFormatter dtf = new DateTimeFormatterBuilder()
                    .parseCaseInsensitive()
                    .appendPattern("d-MMM-uuuu")
                    .toFormatter(Locale.ENGLISH);
            LocalDate.parse(String.format("%s-%s-2012", date, month), dtf); // Hard coded a leap year or common year
            isValid = true;
        } catch (Exception e) {
            //e.printStackTrace();
            isValid = false;
        }
        return isValid;
    }

    public static boolean isValidID(String id) {
        String regEx = "^(\\d{5}|\\d{6}|\\d{9}|\\d{10})$"; // 
        return id.matches(regEx);
    }

    public static boolean isValidSurname(String name)
    {
        String regEx = "^[A-Z]+$";
        return name.matches(regEx);
    }

    public static boolean isValidFirstLetter(String name)
    {
        String regEx = "^[A-Z]$";
        return name.matches(regEx);
    }

    public static boolean isValidSleptCount(String number)
    {
        boolean isValid = false;
        try {
            int count = Integer.parseInt(number);
            if (count >= 0 && count < 24) {
                isValid = true;
            }
        } catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }

}