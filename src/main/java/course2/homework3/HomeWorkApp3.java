package course2.homework3;

/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные
поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать
(в том числе Scanner), тестировать просто из метода main() прописывая add() и get().

 */



public class HomeWorkApp3 {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhone("Ivanov", "9215623152");
        phoneBook.addPhone("Sidorov", "9035676523");
        phoneBook.addPhone("Ivanov", "9631236547");
        phoneBook.addPhone("Petrov", "9111521618");

        System.out.println("Phone number for Ivanov " + phoneBook.getPhonesByName("Ivanov"));
        System.out.println("Phone number for Sidorov " + phoneBook.getPhonesByName("Sidorov"));


    }
}

