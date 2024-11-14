package AP_Calander;

public class APCalendar {

    /**
     * Returns true if year is a leap year and false otherwise.
     */
    private static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not divisible by 100, unless also divisible by 400
        if (year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        
        return count;
    }

    /**
     * Returns the value representing the day of the year, where 1 represents January 1.
     * Precondition: 1 <= month <= 12, 1 <= day <= number of days in month
     *               The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year) {
        //assign number of days in a year to an array
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int dayOfYear = day;
        
        // Check if leap year for February adjustment
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        // Sum days from previous months
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        
        return dayOfYear;
    }

    public static int firstDayofYear(int year){
        return 0;
    }

    /**
     * Returns n, where month, day, and year specify the nth day of the week.
     * 0 represents Sunday, 1 represents Monday, ..., and 6 represents Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year) {
        // Modulus by 7 gives us the weekday (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int firstDay=firstDayofYear(year);
        int days = dayOfYear(month, day, year);

        
        return (days+firstDay-1)%7;
    }
    /**
     * Accepts a date string in US format (MM/dd/yyyy or MM-dd-yyyy)and parses using Wrapper classes 
     * and calculates dayOfWeek(int month, int day, int year)

     */
     public static int dayOfWeek(String date ) {
        // Modulus by 7 gives us the weekday (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int currentDay=0;
        
        return currentDay;
    }
}