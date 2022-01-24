package course1.homework6;

public class Dog extends Animal {

    public Dog(String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
        if (getRunDist() > 500) {
            System.out.println("Животное по имени " + getName() + " не может пробежать " + runDist + " метров");

        } else System.out.print("Животное по имени " + getName() + " пробежало " + runDist + " метров");
        System.out.println();
        if (getRunDist() < 0) {
            System.out.println("Не может быть отрицательным числом");
        }

        if (getSwimDist() > 10) {
            System.out.println("Животное по имени " + getName() + " не может проплыть " + swimDist + " метров");

        } else System.out.print("Животное по имени " + getName() + " проплыло " + swimDist + " метров");
        System.out.println();

        if (getSwimDist() < 0) {
            System.out.println("Не может быть отрицательтым числом");
        }
    }

    @Override
    public void ifRun(int getRunDist) {
        if (getRunDist() > 500) {
            System.out.println("Животное по имени " + getName() + " не может пробежать " + getRunDist + " метров");

        } else System.out.print("Животное по имени " + getName() + " пробежало " + getRunDist + " метров");

        System.out.println();
        if (getRunDist() < 0) {
            System.out.println("Не может быть отрицательным числом");
        }
    }

    @Override
    public void ifSwim(int getSwimDist) {
        if (getSwimDist() > 10) {
            System.out.println("Животное по имени " + getName() + " не может проплыть " + getSwimDist + " метров");

        } else System.out.print("Животное по имени " + getName() + " проплыло " + getSwimDist + " метров");

        System.out.println();
        if (getSwimDist() < 0) {
            System.out.println("Не может быть отрицательтым числом");
        }
    }

}