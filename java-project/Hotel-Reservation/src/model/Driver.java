package model;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "Last", "jsmith@email.com");

        System.out.println(customer);
    }
}