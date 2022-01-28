package course1.lesson7;


public final class Bike extends Transport {
    int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("Rrrrr");
    }

    @Override
    public void printInventionDate() {
        //any other logic
        System.out.println("1950");
    }
    public boolean requireHelmet() {
        return true;
    }
}

