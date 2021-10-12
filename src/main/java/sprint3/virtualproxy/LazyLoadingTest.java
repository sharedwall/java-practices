package sprint3.virtualproxy;

import java.util.List;

public class LazyLoadingTest {

    public static void main(String[] args)
    {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company
                ("Hara", "Iran", "+98-9383886728", contactList);

        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Company Address: " + company.getCompanyAddress());
        System.out.println("Company Contact No.: " + company.getCompanyContactNo());
        System.out.println("Requesting for contact list");

        contactList = company.getContactList();
        List<Employee> empList = contactList.getEmployeeList();
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
