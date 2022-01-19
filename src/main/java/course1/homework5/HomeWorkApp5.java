package course1.homework5;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// Конструктор класса должен заполнять эти поля при создании объекта.
// Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
// Создать массив из 5 сотрудников.
// Пример:
// Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
// persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
// persArray[1] = new Person(...);
//...
// persArray[4] = new Person(...);
// С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


import java.util.Arrays;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "eample1@in.com", "91112345678", 40000, 20);
        employeeArray[1] = new Employee("Petrov Vasiliy", "Developer", "example2@in.com", "92112345678", 50000, 23);
        employeeArray[2] = new Employee("Petrov Evgeniy", "DevOps", "example3@in.com", "92112345678", 110000, 23);
        employeeArray[3] = new Employee("Smirnov Vasiliy", "QA", "example4@in.com", "92112345658", 100000, 41);
        employeeArray[4] = new Employee("Shostakovich Vasiliy", "Team Lead", "example5@in.com", "92112346678", 130000, 49);

        /*employeeArray[1].setEmployeeAge(20);
        employeeArray[1].setEmployeeEmail("gggg@in.com");
        employeeArray[1].setEmployeePhone("999999999");
        employeeArray[1].setEmployeePosition("QA");
        employeeArray[1].setEmployeeSalary(300000);
*/
        System.out.println();
        employeeArray[1].printEmployee();
        System.out.println();
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getEmployeeAge() > 40) {
                System.out.println(employeeArray[i].printEmployee())
            }

        }

    }

}
