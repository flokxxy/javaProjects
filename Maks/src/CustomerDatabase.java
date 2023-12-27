public class CustomerDatabase {
    private String fullName;
    private String address;
    private String orderData;
    private String phoneNumber;

    public CustomerDatabase(String fullName, String address, String orderData, String phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.orderData = orderData;
        this.phoneNumber = phoneNumber;
    }

    // Геттеры и сеттеры для доступа к данным клиента

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderData() {
        return orderData;
    }

    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
