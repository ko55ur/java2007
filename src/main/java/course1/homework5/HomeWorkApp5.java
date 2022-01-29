package course1.homework5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "eample1@in.com", "91112345678", 40000, 20);
        employeeArray[1] = new Employee("Petrov Vasiliy", "Developer", "example2@in.com", "92112345678", 50000, 23);
        employeeArray[2] = new Employee("Petrov Evgeniy", "DevOps", "example3@in.com", "92112345678", 110000, 23);
        employeeArray[3] = new Employee("Smirnov Vasiliy", "QA", "example4@in.com", "92112345658", 100000, 41);
        employeeArray[4] = new Employee("Shostakovich Vasiliy", "Team Lead", "example5@in.com", "92112346678", 130000, 49);

        System.out.println();
        employeeArray[1].printEmployee();
        System.out.println();
        for (Employee employee : employeeArray)
            if (employee.getAge() > 40) {
                employee.printEmployee();
            }
    }

}
