package course1.homework7;

public class Plate {

    private int food;

    public Plate(int n) {
        food = n < 0 ? -n : n;
        info();
    }

    public int getFood() {

        return food;
    }

    public void setFood(int food) {
        this.food = food;

    }

    public boolean decreaseFood(int n) {

        if (food < n) {
            System.out.println("В тарелке мало еды");
            return false;
        } else {

            food -= n;
            return true;
        }

    }

    public void info() {
        System.out.println("В тарелке " + food);
    }

    public void addFood(int n) {

        food += n < 0 ? -n : n;
    }

}
