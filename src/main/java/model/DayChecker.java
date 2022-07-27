package model;

public class DayChecker{
    public static String  isTodayFriday(final String todday){
        return "Friday".equals(todday)? "TGIF" : "Nope";
    }
}