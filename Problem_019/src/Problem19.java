/* You are given the following information, but you may prefer to do some research for yourself.
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

import java.util.HashMap;
import java.util.Map;

public class Problem19 {
    public static int numDays(int month, int year){
        int days = 0;

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            days = 31;
        else if(month == 2){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if (year % 400 == 0)
                        days = 29;
                    else
                        days = 28;
                }
                else
                    days = 29;
            }
            else
                days = 28;
        }
        else
            days = 30;

        return days;
    }
    public static void main(String[] args){
        Map<Integer, String> weekDays = new HashMap<>();
        int counter = 1;    // keeps track of day of the week; counter = 1 for Sunday
        int tally = 0;      // keeps track of the number of Sundays occurring on the first of the month

        weekDays.put(1, "Sunday");
        weekDays.put(2, "Monday");
        weekDays.put(3, "Tuesday");
        weekDays.put(4, "Wednesday");
        weekDays.put(5, "Thursday");
        weekDays.put(6, "Friday");
        weekDays.put(7, "Saturday");

        for(int year = 1900; year < 2001; year++){
            for(int month = 1; month < 13; month++){
                int days = numDays(month, year);

                for(int monthDate = 1; monthDate <= days; monthDate++){
                    counter += 1;   // starts on Monday January 1, 1900 (i.e. counter should start at 2)

                    if((monthDate == 1) && (weekDays.get(counter) == "Sunday")){
                        /* Ran program with the line below to find the number of Sundays occurring on the first
                           of the month in 1900. This number will be deducted from the total tally.
                        System.out.println(year); */
                        tally += 1;
                    }

                    if(counter >= 7)
                        counter = 0;
                }
            }
        }

        tally = tally - 2;     // deducted the number of Sundays occurring on the first of the month in 1900

        System.out.println("There were " + tally + " Sundays occurring on the first of the month during the twentieth century.");
    }
}
