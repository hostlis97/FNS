public class Calc {

    public static double usnIncome(int income) {
        double tax = income * 0.06;
        return tax;
    }

    public static double usnIncomeMinusExpenditure(int income, int expenditure) {
        double tax = (income - expenditure) * 15 / 100;
        if (tax <= 0) {
            System.out.println("Ваши расходы привышают доходы!");
            return 0;
        }
        return tax;
    }

    public static int economy(int usnIncomeMinusExpenditure, int usnIncome) {
        if (usnIncome > usnIncomeMinusExpenditure) {
            return usnIncome - usnIncomeMinusExpenditure;
        } else
            return usnIncomeMinusExpenditure - usnIncome;
    }
}
