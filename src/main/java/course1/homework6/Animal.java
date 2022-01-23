package course1.homework6;

public class Animal {

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    protected int run;
    protected int swim;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int run, int swim, String name) {
        this.run = run;
        this.swim = swim;
        this.name = name;
    }

    protected String name;

    public void info() {
        System.out.println("Животное: " + name);
    }
    public void ifRun() {
        System.out.print("Животное по имени " + name + " пробежало " + run + " метров");

    }
    public void ifSwim() {
        System.out.print(" и проплыло " + swim + " метров");
        System.out.println();
    }
    public void swimRun() {
        System.out.println("Животное по имени " + name + " пробежало " + run + " метров" + " и проплыло " + swim + " метров");
    }

}

