package course1.homework6;

public class Cat extends Animal {


    public Cat(String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
        if (getRunDist() > 200) {
            System.out.print(" Животное по имени " + name + " не может пробежать " + runDist + " метров ");

        } else System.out.print(" Животное по имени " + name + " пробежало " + runDist + " метров ");
        System.out.println();
        if (getRunDist() < 0) {
            System.out.println(" Не может быть отрицательным числом");
        }

        if ((getSwimDist() > 0) || (getSwimDist() == 0)) {
            System.out.println(" Животное по имени " + name + " не умеет плавать!");
            if (getSwimDist() < 0) {
                System.out.println("Не может быть отрицательным числом");
            }
        }
    }

    @Override
    public void ifSwim(int swimDist) {
        if ((swimDist > 0) || (swimDist == 0)) {
            System.out.println(" Животное по имени " + name + " не умеет плавать!");
            if (swimDist < 0) {
                System.out.println(" Не может быть отрицательным числом");
            }
        }
    }

    @Override
    public void ifRun(int runDist) {
        if (runDist > 200) {
            System.out.println(" Животное по имени " + name + " не может пробежать " + runDist + " метров");

        } else System.out.print(" Животное по имени " + name + " пробежало " + runDist + " метров");
        System.out.println();

        if (runDist < 0) {
            System.out.println("Не может быть отрицательным числом");
        }
    }
}