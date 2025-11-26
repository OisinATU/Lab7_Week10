package ie.atu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CustomerTest {
    public static void main(String[] args) {

        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                true,
                1001
        );

        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        System.out.println(part1Customer);
        System.out.println(part2Customer);

        PreferredCustomer pc = new PreferredCustomer();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        System.out.println(pc);

        pc.addLoyaltyPoints(700);
        System.out.println(pc);
        pc.addLoyaltyPoints(800);
        System.out.println(pc);


    }
}