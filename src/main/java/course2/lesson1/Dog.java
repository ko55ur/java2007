package course2.lesson1;

public class Dog implements Moving, Attacking {

    @Override
    public void move(int length) {

        System.out.println("Dog walk");
    }

    @Override
    public void attack() {
        System.out.println("Dog bites");
    }
}

