package course1.homework6;

public class Cat extends Animal {


    public Cat(String name, int runDist, int swimDist) {
        super(name, runDist, swimDist);
        if (getRunDist() > 200) {
            System.out.print(" Животное по имени " + getName() + " не может пробежать " + runDist + " метров ");

        } else System.out.print(" Животное по имени " + getName() + " пробежало " + runDist + " метров ");
        System.out.println();
        if (getRunDist() < 0) {
            System.out.println(" Не может быть отрицательным числом");
        }

        if ((getSwimDist() > 0) || (getSwimDist() == 0)) {
            System.out.println(" Животное по имени " + getName() + " не умеет плавать!");
            if (getSwimDist() < 0) {
                System.out.println("Не может быть отрицательным числом");
            }
        }
    }

    @Override
    public void ifSwim(int getSwimDist) {
        if ((getSwimDist() > 0) || (getSwimDist() == 0)) {
            System.out.println(" Животное по имени " + getName() + " не умеет плавать!");
            if (getSwimDist() < 0) {
                System.out.println(" Не может быть отрицательным числом");
            }
        }
    }

    @Override
    public void ifRun(int getRunDist) {
        if (getRunDist() > 200) {
            System.out.println(" Животное по имени " + getName() + " не может пробежать " + getRunDist + " метров");

        } else System.out.print(" Животное по имени " + getName() + " пробежало " + getRunDist + " метров");
        System.out.println();

        if (getRunDist() < 0) {
            System.out.println("Не может быть отрицательным числом");
        }
    }


}