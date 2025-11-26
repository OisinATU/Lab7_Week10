package ie.atu;

public class PreferredCustomer extends Customer {

    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.

    public PreferredCustomer(String name, String address, String phoneNumber, boolean mailingList, int customerNumber, int loyaltyPoints) {
        super(name, address, phoneNumber, mailingList, customerNumber);
        this.loyaltyPoints = loyaltyPoints;
    }

    public PreferredCustomer() {
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }


    private void updateDiscountLevel() {
        // set discountLevel based on loyaltyPoints
        if(loyaltyPoints < 500) {
            this.discountLevel = 0;
        } else if(loyaltyPoints < 1000) {
            this.discountLevel = 0.05;
        } else if(loyaltyPoints < 1500) {
            this.discountLevel = 0.06;
        }  else if(loyaltyPoints < 2000) {
            this.discountLevel = 0.07;
        } else{
            this.discountLevel = 0.1;
        }
    }


    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }


    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }


    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }

}
