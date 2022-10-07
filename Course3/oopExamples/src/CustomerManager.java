public class CustomerManager {
    Customer customer;

    CreditManagerImpl creditManager;

    public CustomerManager(Customer customer,CreditManagerImpl creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void saved(){
        System.out.println(customer.firstName + " Customer Saved");
    }

    public void giveCredit(){
        System.out.println(customer.firstName + " Customer credit gived");
    }
}
