package solidPrinciples;

public class OrderAction implements TotalPriceCalculator,CustomerDetail {

    @Override
    public void placeOrder(String custName, String address) {
        System.out.println("Order placed for: "+custName+ " at "+address);
    }

    @Override
    public void calculateTotal(double price, int quantity) {
        double totalPrice = price * quantity;
        System.out.println("Order Total: $"+ totalPrice);
    }
}
