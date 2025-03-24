package solidPrinciples;

public class OrderTest {
    public static void main(String[] args) {

        CustomerAccount account = new CustomerAccount("Vien","20 L. Abenojar St.", 40.0,2);

        OrderAction ordered = new OrderAction();
        SendNotification alert = new SendNotification();
        Invoice invoice = new Invoice();

        ordered.calculateTotal(account.getPrice(),account.getQuantity());
        ordered.placeOrder(account.getCustName(),account.getAddress());

        invoice.generateInvoice("SalesInvoice_123.pdf");
        alert.sendEmail("amityjhames.abaja@neu.edu.ph");
    }
}
