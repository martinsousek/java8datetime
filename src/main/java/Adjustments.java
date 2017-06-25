import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by martin on 25.06.17.
 */
public class Adjustments {

    public static void main(String[] args){
        LocalDate tommorow = LocalDate.now().plusDays(1);
        System.out.println(tommorow);

        LocalTime fiveHours30minutesAgo = LocalTime.now().minusHours(5).minusMinutes(30);
        System.out.println(fiveHours30minutesAgo);

        LocalDate birthDay = LocalDate.of(1988, 6, 10);
        System.out.println(birthDay.with(TemporalAdjusters.firstDayOfMonth()));

        System.out.println(birthDay.with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println(birthDay.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));



    }
}
