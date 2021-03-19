package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

class InvoiceFactory {

    static Invoice createInvoice(Id aggregateId, ClientData client) {
        return new Invoice(aggregateId, client);
    }

}
