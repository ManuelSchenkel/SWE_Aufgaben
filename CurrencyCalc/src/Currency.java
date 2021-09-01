
public class Currency {

    public static void main(String[] args) {
        final double EXCHANGE_USD = 1.11;
        final double EXCHANGE_GBP = 0.78;
        final double EXCHANGE_RAND = 15.23;

        double betrag = 100;

        System.out.println(betrag + " CHF in USD: " + CurrencyCalc.convertToCurrency(betrag, EXCHANGE_USD));
        System.out.println(betrag + " CHF in GBP: " + CurrencyCalc.convertToCurrency(betrag, EXCHANGE_GBP));
        System.out.println(betrag + " CHF in RAND: " + CurrencyCalc.convertToCurrency(betrag, EXCHANGE_RAND));
    }
}
