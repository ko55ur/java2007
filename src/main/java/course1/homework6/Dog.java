package course1.homework6;

public class Dog extends Animal {

    public Dog(String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
        if (runDist > 500) {
            System.out.println("Животное по имени " + name + " не может пробежать " + runDist + " метров");

        } else System.out.print("Животное по имени " + name + " пробежало " + runDist + " метров");
        System.out.println();
        if (runDist < 0) {
            System.out.println("Не может быть отрицательным числом");
        }

        if (swimDist > 10) {
            System.out.println("Животное по имени " + name + " не может проплыть " + swimDist + " метров");

        } else System.out.print("Животное по имени " + name + " проплыло " + swimDist + " метров");
        System.out.println();

        if (getSwimDist() < 0) {
            System.out.println("Не может быть отрицательтым числом");
        }
    }

    @Override
    public void ifRun(int runDist) {
        if (runDist > 500) {
            System.out.println("Животное по имени " + name + " не может пробежать " + runDist + " метров");

        } else System.out.print("Животное по имени " + name + " пробежало " + runDist + " метров");

        System.out.println();
        if (runDist < 0) {
            System.out.println("Не может быть отрицательным числом");
        }
    }

    @Override
    public void ifSwim(int swimDist) {
        if (swimDist > 10) {
            System.out.println("Животное по имени " + name + " не может проплыть " + swimDist + " метров");

        } else System.out.print("Животное по имени " + name + " проплыло " + swimDist + " метров");

        System.out.println();
        if (swimDist < 0) {
            System.out.println("Не может быть отрицательтым числом");
        }
    }

}