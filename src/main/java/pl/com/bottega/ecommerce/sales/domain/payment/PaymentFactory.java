package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

class PaymentFactory {

    static Payment createPayment(Id aggregateId, ClientData client, Money amount) {
        return new Payment(aggregateId, client, amount);
    }

}
