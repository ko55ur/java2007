package course1.lesson7;

public abstract class Transport {
    protected String color;




    void printName() {System.out.println("Transport");}


    public abstract void wroomWroom();


    @Override
    public void printInventionDate() {
        System.out.println("1980");
    }
}
