package pl.javastart.zadaniemockito;

import java.time.LocalTime;

public class MealNameProvider {

    public String provideMealName() {
        LocalTime currentTime = LocalTime.now();

        if (currentTime.isBefore(LocalTime.NOON)) {
            return "Śniadanie";
        } else if (currentTime.isBefore(LocalTime.of(16, 0))) {
            return "Obiad";
        }

        return "Kolacja";
    }

}
