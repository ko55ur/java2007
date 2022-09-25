package course_algo.homework2;

import lombok.Value;

/* Необходимо отсортировать массив, состоящий из экземпляров класса Notebook в количестве 10000 штук.

Класс Notebook содержит поля:
1. Стоимость - price, double [100, 200, 300, 400, 500, 600, 700]
2. Оперативная память - ram, integer [4, 8, 16, 20, 24]
3. Производитель - brand, enum
3.1. Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou. Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).

Отсортировать:
1. По стоимости
2. По оперативной памяти
3. По бренду

*** Вынести логику сортировки в отдельное место. Пусть это место использует Comparator
*/

@Value
public class NoteBook implements Comparable<NoteBook> {

    Brand brand;
    double price;
    int ram;

    @Override
    public int compareTo(NoteBook n) {
        int result = Double.compare(price, n.getPrice());
        if (result == 0) {
            result = Integer.compare(ram, n.getRam());
            if (result == 0) {
                return brand.compareTo(n.getBrand());
            }
            return result;
        }
        return result;
    }

    public enum Brand {
        Lenuvo, Asos, MacNote, Eser, Xamiou

    }
}

