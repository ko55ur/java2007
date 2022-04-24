package course2.lesson1;

public class Ork implements Moving, Attacking {

    @Override
    public void move(int length) {
        System.out.println("Ork walking on paws");
    }

    @Override

    public void attack() {


        System.out.println("Ork beats with axe");
    }
}
