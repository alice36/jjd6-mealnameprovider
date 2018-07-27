package pl.javastart.zadaniemockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class MealNameProviderTest {

    @Mock private CurrentDateProvider currentDateProvider;
    @InjectMocks private MealNameProvider mealNameProvider;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shouldBeBreakfast() {
        // given
        LocalTime localTime = LocalTime.of(6, 0);
        when(currentDateProvider.getCurrentTime()).thenReturn(localTime);

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName, is("Śniadanie"));
    }

    @Test
    public void shouldBeDinner() {
        // given
        LocalTime localTime = LocalTime.of(15, 0);
        when(currentDateProvider.getCurrentTime()).thenReturn(localTime);

        // when
        String mealName = mealNameProvider.provideMealName();

        // then
        assertThat(mealName, is("Obiad"));
    }

}