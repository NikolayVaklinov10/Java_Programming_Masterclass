import java.util.Calendar;

public class LeapYearCalculator {
//    public static boolean isLeapYear(int year) {
//        if (year >= 1 && year <= 9999) {
//            if (year % 4 != 0) {
//                return false;
//            } else if (year % 400 == 0) {
//                return true;
//            } else if (year % 100 == 0) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//
//        return false;
//    }

    // OR BETTER IMPLEMENTATION
    public static boolean isLeapYear(int year){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}



