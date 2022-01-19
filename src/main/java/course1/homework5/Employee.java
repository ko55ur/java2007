package course1.homework5;

public class Employee {

    private String employeeFullName;
    private String employeePosition;
    private String employeeEmail;
    private String  employeePhone;
    private int employeeSalary;
    private int employeeAge;

    public Employee(String employeeFullName, String employeePosition, String employeeEmail, String employeePhone, int employeeSalary, int employeeAge) {
        this.employeeFullName = employeeFullName;
        this.employeePosition = employeePosition;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String  getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String  employeePhone) {
        this.employeePhone = employeePhone;
    }
    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public int setEmployeeAge(int employeeAge) {
        if (employeeAge >= 0) {
            this.employeeAge = employeeAge;
        } else {
            System.out.println("Введен некорректный возраст");
        }
        return employeeAge;
    }
    public void printEmployee() {
        System.out.println(getEmployeeFullName()+ " " + getEmployeePosition() + " " + getEmployeeEmail() + " " + getEmployeePhone() + " " + getEmployeeSalary() + " " + getEmployeeAge());
    }
   // public void overAge() {
     //   for (int i = 0; i <; i++) {

       // }
    //}
}
