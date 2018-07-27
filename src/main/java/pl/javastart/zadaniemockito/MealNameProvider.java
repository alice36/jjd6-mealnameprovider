package pl.javastart.zadaniemockito;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class MealNameProvider {

    private CurrentDateProvider currentDateProvider;

    public MealNameProvider(CurrentDateProvider currentDateProvider) {
        this.currentDateProvider = currentDateProvider;
    }

    public String provideMealName() {

        LocalTime currentTime = currentDateProvider.getCurrentTime();

        if (currentTime.isBefore(LocalTime.NOON)) {
            return "Śniadanie";
        } else if (currentTime.isBefore(LocalTime.of(16, 0))) {
            return "Obiad";
        }

        return "Kolacja";
    }

}
