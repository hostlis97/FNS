import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcTest {

    @Test
    public void testUsnIncome() {
        double result = Calc.usnIncome(200);
        Assertions.assertEquals(12, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {500, 300, 100})
    public void testUsnIncomeMinusExpenditure(int expenditure) {
        int result = (int) Calc.usnIncomeMinusExpenditure(2000, expenditure);
        Assertions.assertEquals((2000 - expenditure) * 15 / 100, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1000, 2000, 2500})
    public void testZeroUsnIncomeMinusExpenditure(int expenditure) {
        int result = (int) Calc.usnIncomeMinusExpenditure(500, expenditure);
        Assertions.assertEquals(0, result);
    }
}
