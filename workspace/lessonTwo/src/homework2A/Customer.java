package homework2A;

public class Customer extends Person {

    private int customerId;


    public Customer(int customerId,String firstName, String lastName) {
        super(firstName, lastName);
        this.customerId = customerId;
    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String getGreeting() {
        return "Merhabalar müşteri...";
    }

    @Override
    public String getRole() {
        return "customer";
    }
}
