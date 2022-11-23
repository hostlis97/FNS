import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalcTest {

    @Test
    public void testUsnIncome() {
       double result = Calc.usnIncome(200);
        Assertions.assertEquals(12, result);
    }

    @ParameterizedTest
    public void testUsnIncomeMinusExpenditure() {

    }
}
