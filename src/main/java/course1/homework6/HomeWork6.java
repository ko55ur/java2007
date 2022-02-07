package course1.homework6;

/* Создать классы Собака и Кот с наследованием от класса Животное.
   Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
   (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
   У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
*  Добавить подсчет созданных котов, собак и животных.


*/

public class HomeWork6 {
    public static void main(String[] args) {
        Animal dog = new Dog("Tuzik", 100, 5);
        Animal cat = new Cat("Kisa", 100, 2);
        Animal cat1 = new Cat("Koshak", 26, 85);
        Animal dog2 = new Dog("Barbos", 60, 50);
        cat.info();
        dog.info();
        dog.ifRun(5000);
        dog.ifSwim(5000);
        cat.ifRun(10);
        cat.ifSwim(10);
        cat1.info();
        System.out.println();
        System.out.println("Создано животных: " + Animal.count);
        System.out.println("Создано собак: " + Dog.count);
        System.out.println("Создано котов: " + Cat.count);


    }
}
