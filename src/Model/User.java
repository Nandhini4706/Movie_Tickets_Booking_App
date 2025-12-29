package Model;

public class User {
    private int customerId;
    private String customer;

    public User(int customerId , String customer) {
        this.customerId = customerId;
        this.customer=customer;
    }

    public int getCustomerId() {
        return customerId;
    }
    public String getCustomer(){
        return customer;
    }
}
