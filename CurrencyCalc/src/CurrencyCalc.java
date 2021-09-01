public class CurrencyCalc {
    public static double convertToCurrency(double pBetrag, double pRate) {
        double rBetrag;
        rBetrag = pBetrag * pRate;
        return rBetrag;
    }
}
