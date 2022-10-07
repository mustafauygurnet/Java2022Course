public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();

        creditManager.calculate();
        creditManager.saved();

        Company company = new Company();
        company.taxNumber = "12334";
        company.firstName = "A Comp.";

        Customer customer = new Customer(1,"mustafa","uygur","1231");

        CustomerManager customerManager = new CustomerManager(company,new MilitaryCreditManager());
        CustomerManager customerManager2 = new CustomerManager(customer,new TeacherCreditManager());

        customerManager.saved();
        customerManager.giveCredit();
        customerManager2.saved();
        customerManager2.giveCredit();
    }
}