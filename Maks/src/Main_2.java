import java.util.Scanner;
public class Main_2 {
    public static void main(String[] args) {

        CustomerDatabaseArray customerDatabase = new CustomerDatabaseArray();

        // Add customers to the database
        CustomerDatabase customer1 = new CustomerDatabase("John Doe", "123 Main St", "2023-01-01", "555-1234");
        customerDatabase.addCustomer(customer1);

        CustomerDatabase customer2 = new CustomerDatabase("Jane Smith", "456 Elm St", "2001-06-23", "654-6698");
        customerDatabase.addCustomer(customer2);

        CustomerDatabase customer3 = new CustomerDatabase("Jey Lo", "123 Main St", "2012-13-12", "333-5415");
        customerDatabase.addCustomer(customer3);


        customerDatabase.sortByFullName();
        System.out.println("Сортировать по имени:");
        for (CustomerDatabase customer : customerDatabase.getCustomerList()) {
            System.out.println(customer.getFullName());
        }

        customerDatabase.sortByAddress();
        System.out.println("Сортировать по адресу:");
        for (CustomerDatabase customer : customerDatabase.getCustomerList()) {
            System.out.println(customer.getAddress());
        }

        customerDatabase.sortByOrderData();
        System.out.println("Сортировать по дате:");
        for (CustomerDatabase customer : customerDatabase.getCustomerList()) {
            System.out.println(customer.getOrderData());
        }

        customerDatabase.sortByPhoneNumber();
        System.out.println("Сортировать по номеру телефона::");
        for (CustomerDatabase customer : customerDatabase.getCustomerList()) {
            System.out.println(customer.getPhoneNumber());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя для поиска: ");
        String searchName = scanner.nextLine();
        CustomerDatabase foundCustomer = customerDatabase.searchByFullName(searchName);
        if (foundCustomer != null) {
            System.out.println("Клиент найден: " + foundCustomer.getFullName());
        } else {
            System.out.println("Клиент не найден.");
        }

    }
}