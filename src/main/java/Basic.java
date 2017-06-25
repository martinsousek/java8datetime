import java.time.*;

/**
 * Created by martin on 25.06.17.
 */
public class Basic {

    public static void main(String[] args){

        // Local Date
        LocalDate today = LocalDate.now();
        System.out.println(String.format("Today is %s", today));

        LocalDate birthday = LocalDate.of(1988, 6, 10);
        System.out.println(birthday);

        LocalDate birthday2 = LocalDate.of(1988, Month.JUNE, 10);
        System.out.println(birthday2);

        LocalDate day40Of2017 = LocalDate.ofYearDay(2017, 40);
        System.out.println(day40Of2017);

        // Local Time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime midday = LocalTime.of(12, 0);
        System.out.println(midday);

        LocalTime middayWithSeconds = LocalTime.of(12, 0, 0);
        System.out.println(middayWithSeconds);

        LocalTime secondOfDay = LocalTime.ofSecondOfDay(63456);
        System.out.println(secondOfDay);

        //Local Date time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime deadline = LocalDateTime.of(2017, Month.JUNE, 15, 12, 0);
        System.out.println(deadline);

        System.out.println(LocalDate.of(2017, 5, 20).isBefore(LocalDate.now()));

        System.out.println(Month.MAY.getValue());
        System.out.println(Month.MAY.minLength());
        System.out.println(Month.MAY.maxLength());
        System.out.println(Month.FEBRUARY.minLength());
        System.out.println(Month.FEBRUARY.maxLength());
        System.out.println(Month.MAY.firstMonthOfQuarter());

        System.out.println(birthday.isLeapYear());
        System.out.println(birthday.lengthOfYear());

        DayOfWeek day = birthday.getDayOfWeek();
        System.out.println(day.name());

        System.out.println(Year.of(2015).isLeap());
        System.out.println(Year.of(2015).length());

        int currentSecondOfDay = LocalTime.now().toSecondOfDay();
        System.out.println(currentSecondOfDay);

    }
}
