public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditYears = 1;//кредитный период (лет)
        double creditPercent = 9.99;//процентная ставка
        int creditAmount = 1_000_000;//сумма кредита

        System.out.println();
        System.out.println("Сумма кредита: " + creditAmount + " рублей," + " Срок кредита: " + creditYears + " год(а)");
        System.out.println("Ежемесячный платеж: ");
        System.out.println(service.creditCalc(1, 9.99, 1000000) + " рублей");

        System.out.println();
        System.out.println("Сумма кредита: " + creditAmount + " рублей," + " Срок кредита: " + creditYears * 2 + " год(а)");
        System.out.println("Ежемесячный платеж: ");
        System.out.println(service.creditCalc(2, 19.98, 1000000) + " рублей");

        System.out.println();
        System.out.println("Сумма кредита: " + creditAmount + " рублей," + " Срок кредита: " + creditYears * 3 + " год(а)");
        System.out.println("Ежемесячный платеж: ");
        System.out.println(service.creditCalc(3, 29.97, 1000000) + " рублей");

    }
}