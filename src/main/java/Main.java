import java.util.Scanner;

public class Main {

    public static void usnIncomeVsUsnIncomeMinusExpenditure(int usnIncome, int usnIncomeMinusExpenditure) {
        if (usnIncome > usnIncomeMinusExpenditure) {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + usnIncomeMinusExpenditure + " рублей");
            System.out.println("Экономия: " + Calc.economy(usnIncomeMinusExpenditure, usnIncome) + " рублей");
        } else {
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + usnIncome + " рублей");
            System.out.println("Налог на другой системе: " + usnIncomeMinusExpenditure + " рублей");
            System.out.println("Экономия: " + Calc.economy(usnIncomeMinusExpenditure, usnIncome) + " рублей.");
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int income = 0;
        int expenditure = 0;
        int usnIncome;
        int usnIncomeMinusExpenditure;
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход:");
            System.out.println("3. Выбрать ситему налогооблажения:");
            String option = s.nextLine();
            if (option.equals("end")) {
                System.out.println("Программа завершена!");
                break;
            }
            int optionInt = Integer.parseInt(option);
            switch (optionInt) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    income += Integer.parseInt(s.nextLine());
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    expenditure += Integer.parseInt(s.nextLine());
                    break;
                case 3:
                    usnIncome = (int) Calc.usnIncome(income);
                    usnIncomeMinusExpenditure = (int) Calc.usnIncomeMinusExpenditure(income, expenditure);
                    if (usnIncomeMinusExpenditure == 0) {
                        break;
                    }
                    usnIncomeVsUsnIncomeMinusExpenditure(usnIncome, usnIncomeMinusExpenditure);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}
