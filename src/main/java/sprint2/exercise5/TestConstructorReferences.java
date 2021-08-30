package sprint2.exercise5;

public class TestConstructorReferences {
    public static void main(String[] args) {
        EmployeeEmpty empEmployee = Employee::new;
        EmployeeWithName employeeWithName = Employee::new;
        System.out.println("Constructor isn't called yet");
        System.out.println(empEmployee.get());
        System.out.println(employeeWithName.get("Mohammad Asheri"));
    }
}
