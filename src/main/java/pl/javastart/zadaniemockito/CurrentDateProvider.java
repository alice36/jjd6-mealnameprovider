package pl.javastart.zadaniemockito;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class CurrentDateProvider {

    private TimeZoneProvider timeZoneProvider;

    public CurrentDateProvider(TimeZoneProvider timeZoneProvider) {
        this.timeZoneProvider = timeZoneProvider;
    }

    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }


}
