import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.PackagesAndCycles.services.PackagesAndCycles;

public class PackagesAndCyclesTest {

        @Test
        public void shouldCalculateMoneyMonths1() {
            PackagesAndCycles service = new PackagesAndCycles();
            int income = 10_000;
            int expenses = 3_000;
            int threshold = 20_000;
            int expected = 3;

            int actual = service.calculateMoneyMonths(income, expenses, threshold);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldCalculateMoneyMonths2() {
            PackagesAndCycles service = new PackagesAndCycles();
            int income = 100_000;
            int expenses = 60_000;
            int threshold = 150_000;
            int expected = 2;

            int actual = service.calculateMoneyMonths(income, expenses, threshold);
            Assertions.assertEquals(expected, actual);
        }
}


