package ie.atu;

public class Customer extends Person{

    private int customerNumber;
    private boolean mailingList;

    public Customer(String name, String address, String phoneNumber, boolean mailingList, int customerNumber) {
        super(name, address, phoneNumber);
        this.mailingList = mailingList;
        this.customerNumber = customerNumber;
    }

    public Customer() {
        super();
        this.mailingList = false;
        this.customerNumber = 0;
    }


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "person=" + super.toString() +
                ", customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }

}
