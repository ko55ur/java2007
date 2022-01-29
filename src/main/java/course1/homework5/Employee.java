package course1.homework5;

public class Employee {

    private String fullName;
    private String position;
    private String eMail;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String eMail, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 120 && age > 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }

    public void printEmployee() {
        System.out.println(getFullName() + " " + getPosition() + " " + getEMail() + " " + getPhone() + " " + getSalary() + " " + getAge());
    }
}
