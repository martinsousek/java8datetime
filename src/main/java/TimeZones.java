import java.time.*;

/**
 * Created by martin on 25.06.17.
 */
public class TimeZones {

    public static void main(String[] args){
        LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(currentTimeInLosAngeles);

        LocalTime nowInUTC = LocalTime.now(Clock.systemUTC());
        System.out.println(nowInUTC);

        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zoneLosAngeles = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneLosAngeles);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedNow = ZonedDateTime.of(now, zoneLosAngeles);
        System.out.println(zonedNow);



    }
}
