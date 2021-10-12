package sprint3.virtualproxy;

import java.util.ArrayList;
import java.util.List;

class ContactListImpl implements ContactList {
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }

    private static List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Ali", 2565.55, "SE"));
        empList.add(new Employee("Hassan", 22574, "Manager"));
        empList.add(new Employee("Mohammad", 3256.77, "G4"));
        empList.add(new Employee("Reza", 4875.54, "SSE"));
        empList.add(new Employee("Saeed", 2847.01, "SE"));
        return empList;
    }
}
