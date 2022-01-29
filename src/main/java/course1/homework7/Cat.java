package course1.homework7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
        if (!satiety) {
            System.out.println(name + " голоден");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p) {

        if (this.satiety) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            System.out.printf("%s съел %d единиц еды\n", this.name, this.appetite);
            this.setSatiety(true);
            }
        }
    }

