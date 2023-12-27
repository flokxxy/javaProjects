import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CustomerDatabaseArray {
    private ArrayList<CustomerDatabase> customerList;

    public CustomerDatabaseArray() {
        customerList = new ArrayList<>();
    }

    public void addCustomer(CustomerDatabase customer) {
        customerList.add(customer);
    }

    public void removeCustomer(CustomerDatabase customer) {
        customerList.remove(customer);
    }

    public ArrayList<CustomerDatabase> getCustomerList() {
        return customerList;
    }

    public void sortByFullName() {
        Collections.sort(customerList, new Comparator<CustomerDatabase>() {
            @Override
            public int compare(CustomerDatabase customer1, CustomerDatabase customer2) {
                return customer1.getFullName().compareTo(customer2.getFullName());
            }
        });
    }

    public void sortByAddress() {
        Collections.sort(customerList, new Comparator<CustomerDatabase>() {
            @Override
            public int compare(CustomerDatabase customer1, CustomerDatabase customer2) {
                return customer1.getAddress().compareTo(customer2.getAddress());
            }
        });
    }

    public void sortByOrderData() {
        Collections.sort(customerList, new Comparator<CustomerDatabase>() {
            @Override
            public int compare(CustomerDatabase customer1, CustomerDatabase customer2) {
                return customer1.getOrderData().compareTo(customer2.getOrderData());
            }
        });
    }

    public void sortByPhoneNumber() {
        Collections.sort(customerList, new Comparator<CustomerDatabase>() {
            @Override
            public int compare(CustomerDatabase customer1, CustomerDatabase customer2) {
                return customer1.getPhoneNumber().compareTo(customer2.getPhoneNumber());
            }
        });
    }

    public CustomerDatabase searchByFullName(String fullName) {
        for (CustomerDatabase customer : customerList) {
            if (customer.getFullName().equals(fullName)) {
                return customer;
            }
        }
        return null; // Return null if no match is found
    }

    public CustomerDatabase searchByAddress(String address) {
        for (CustomerDatabase customer : customerList) {
            if (customer.getAddress().equals(address)) {
                return customer;
            }
        }
        return null; // Return null if no match is found
    }

    public CustomerDatabase searchByOrderData(String orderData) {
        for (CustomerDatabase customer : customerList) {
            if (customer.getOrderData().equals(orderData)) {
                return customer;
            }
        }
        return null; // Return null if no match is found
    }

    public CustomerDatabase searchByPhoneNumber(String phoneNumber) {
        for (CustomerDatabase customer : customerList) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return customer;
            }
        }
        return null; // Return null if no match is found
    }
}
