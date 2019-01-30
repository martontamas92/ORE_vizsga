package converter;

public interface Converter {
	double getRateFor(String currencyFrom, String currencyTo);
	void setRateFor(String currencyFrom, String currencyTo, double rate);
}
