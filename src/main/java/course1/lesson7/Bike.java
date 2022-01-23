package course1.lesson7;


public class Bike extends Transport {
    int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("Rrrrr");

    }
}

