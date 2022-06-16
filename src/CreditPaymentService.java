public class CreditPaymentService {

    public int creditCalc(double creditYears, double creditPercent, double creditAmount) {

        double creditMonth = (creditYears * 12);//расчет кол-ва месяцев
        double creditPercentMonth = (creditPercent / creditMonth);//расчет ставки в месяц
        double onePlusCreditPercentMonth = (1 + creditPercentMonth / 100);//1 + ставка в месяц

        double exponentiate = (Math.pow(onePlusCreditPercentMonth, creditMonth));//возведение в степень равную кол-ву месяцев

        double exponentiateMinusOne = (exponentiate - 1);//возведенное в месяц - 1
        double iDivideI = (creditPercentMonth / exponentiateMinusOne);//деление
        double iDivideIPlusI = (creditPercentMonth + iDivideI);//прибавление ставки в месяц
        double iDivideIPlusIXcreditAmount = (creditAmount * iDivideIPlusI / 100);//костыль в виде сдвига точки

        int iDivideIPlusIXcreditAmountFinal = (int) iDivideIPlusIXcreditAmount;//костыль в виде округление
        return iDivideIPlusIXcreditAmountFinal;

    }

}
