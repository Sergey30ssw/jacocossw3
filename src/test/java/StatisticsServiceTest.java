import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 5, 8, 4, 5, 3, 8, 6, 13, 11, 12};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxIfAllIncomesSame() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {19, 15, 5, 3, 7, 14, 9, 7, 13, 16, 3};
        long expected = 19;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}