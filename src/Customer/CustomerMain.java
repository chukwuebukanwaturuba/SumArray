package Customer;

public class CustomerMain {
    public static void main(String[] args) {

        Customer customer = new Customer("Chukwuebuka", 1000,
                "ebusclement@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        System.out.println();
        Customer frank = new Customer();
        System.out.println(frank.getName());
        System.out.println(frank.getCreditLimit());
        System.out.println(frank.getEmailAddress());

    }
}
