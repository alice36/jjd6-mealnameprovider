package pl.javastart.zadaniemockito;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        MealNameProvider nameProvider = context.getBean(MealNameProvider.class);
        System.out.println(nameProvider.provideMealName());


//        TimeZoneProvider timeZoneProvider = new TimeZoneProvider();
//        CurrentDateProvider currentDateProvider = new CurrentDateProvider(timeZoneProvider);
//        MealNameProvider mealNameProvider = new MealNameProvider(currentDateProvider);
//
//        System.out.println(mealNameProvider.provideMealName());

    }


}
