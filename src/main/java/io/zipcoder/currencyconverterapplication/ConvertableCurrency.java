package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        CurrencyType newCurrency = CurrencyType.getTypeOfCurrency(this);

        return currencyType.getRate()/newCurrency.getRate();
    }
}
