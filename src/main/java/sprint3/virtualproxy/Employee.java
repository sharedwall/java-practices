package sprint3.virtualproxy;

class Employee {
    private final String employeeName;

    private final double employeeSalary;
    private final String employeeDesignation;

    public Employee(String employeeName, double employeeSalary, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public String toString() {
        return "Employee Name: " + employeeName + ", EmployeeDesignation : " + employeeDesignation + ", Employee Salary : " + employeeSalary;
    }
}