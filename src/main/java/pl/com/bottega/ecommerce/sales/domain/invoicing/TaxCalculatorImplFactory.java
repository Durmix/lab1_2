package pl.com.bottega.ecommerce.sales.domain.invoicing;

public class TaxCalculatorImplFactory {

    static TaxCalculatorImpl createTaxCalculator() {
        return new TaxCalculatorImpl();
    }

}
