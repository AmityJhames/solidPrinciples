package solidPrinciples;

public class CustomerAccount {
    private String custName;
    private String address;
    private double price;
    private int quantity;

    public CustomerAccount (String custName,String address,double price, int quantity){
        this.custName = custName;
        this.address = address;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCustName(){
        return custName;
    }
    public String getAddress(){
        return address;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}

