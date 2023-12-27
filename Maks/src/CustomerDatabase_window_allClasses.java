import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CustomerDatabase_window_allClasses extends JFrame {
    private CustomerDatabaseArray customerDatabase;
    private JList<String> customerList;

    public CustomerDatabase_window_allClasses() {
        customerDatabase = new CustomerDatabaseArray();

        // Создание и настройка окна
        setTitle("Customer Database");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);



        Dimension panelSize = new Dimension(800, 600);
        // Создание компонентов интерфейса
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setPreferredSize(panelSize);
        customerList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(customerList);

        Dimension buttonSize = new Dimension(100, 30);

        JButton addButton = new JButton("Add Customer");
        JButton removeButton = new JButton("Remove Customer");

        JButton sortByNameButton = new JButton("Sort by Name");
        JButton sortByAddressButton = new JButton("Sort by Address");
        JButton sortByOrderDataButton = new JButton("Sort by Order Data");
        JButton sortByPhoneNumberButton = new JButton("Sort by Phone Number");



        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
        buttonsPanel.add(sortByNameButton);
        buttonsPanel.add(sortByAddressButton);
        buttonsPanel.add(sortByOrderDataButton);
        buttonsPanel.add(sortByPhoneNumberButton);

        // Добавление компонентов на панель
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(addButton, BorderLayout.NORTH);
        mainPanel.add(removeButton, BorderLayout.SOUTH);
        mainPanel.add(buttonsPanel, BorderLayout.WEST);

        // Установка GridBagLayout на панель
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Установка кнопки в определенную ячейку
        constraints.gridx = 1;
        constraints.gridy = 0;
        mainPanel.add(sortByNameButton, constraints);


        // Добавление панели на окно
        add(mainPanel);

        // Обработка событий кнопок
        addButton.addActionListener(e -> addCustomer());
        removeButton.addActionListener(e -> removeCustomer());

        sortByNameButton.addActionListener(e -> sortByFullName());
        sortByAddressButton.addActionListener(e -> sortByAddress());
        sortByOrderDataButton.addActionListener(e -> sortByOrderData());
        sortByPhoneNumberButton.addActionListener(e -> sortByPhoneNumber());

        // Обновление списка клиентов
        updateCustomerList();
    }

    private void addCustomer() {
        // Отображение диалогового окна для ввода данных о клиенте
        String fullName = JOptionPane.showInputDialog(this, "Enter Full Name:");
        String address = JOptionPane.showInputDialog(this, "Enter Address:");
        String orderData = JOptionPane.showInputDialog(this, "Enter Order Data:");
        String phoneNumber = JOptionPane.showInputDialog(this, "Enter Phone Number:");

        // Создание объекта CustomerDatabase и добавление его в базу данных
        CustomerDatabase customer = new CustomerDatabase(fullName, address, orderData, phoneNumber);
        customerDatabase.addCustomer(customer);

        // Обновление списка клиентов
        updateCustomerList();
    }

    private void removeCustomer() {
        // Получение выбранного клиента из списка
        int selectedIndex = customerList.getSelectedIndex();
        if (selectedIndex != -1) {
            // Удаление выбранного клиента из базы данных
            CustomerDatabase customer = customerDatabase.getCustomerList().get(selectedIndex);
            customerDatabase.removeCustomer(customer);

            // Обновление списка клиентов
            updateCustomerList();
        }
    }


    private void sortByFullName() {
        customerDatabase.sortByFullName();
        updateCustomerList();
    }

    private void sortByAddress() {
        customerDatabase.sortByAddress();
        updateCustomerList();
    }

    private void sortByOrderData() {
        customerDatabase.sortByOrderData();
        updateCustomerList();
    }

    private void sortByPhoneNumber() {
        customerDatabase.sortByPhoneNumber();
        updateCustomerList();
    }




    private void updateCustomerList() {
        // Получение списка клиентов из базы данных
        ArrayList<CustomerDatabase> customers = customerDatabase.getCustomerList();

        // Создание массива строк для отображения в JList
        String[] customerNames = new String[customers.size()];
        for (int i = 0; i < customers.size(); i++) {
            customerNames[i] = customers.get(i).getFullName();
        }

        // Обновление JList с новыми данными
        customerList.setListData(customerNames);
    }

    public static void main(String[] args) {
        // Создание и отображение окна
        SwingUtilities.invokeLater(() -> {
            CustomerDatabase_window_allClasses gui = new CustomerDatabase_window_allClasses();
            gui.setVisible(true);
        });
    }
}