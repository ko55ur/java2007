package course1.homework6;

public class Animal {

    static int count = 0;

    protected String name;
    protected int runDist;
    protected int swimDist;

    public Animal(String name, int runDist, int swimDist) {
        this.name = name;
        this.runDist = runDist;
        this.swimDist = swimDist;

        count++;
    }


    public int getRunDist() {
        return runDist;
    }

    public void setRunDist(int runDist) {
        this.runDist = runDist;
    }

    public int getSwimDist() {
        return swimDist;
    }

    public void setSwimDist(int swimDist) {
        this.swimDist = swimDist;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Животное: " + name);
    }

    public void ifRun(int runDist) {
        System.out.print("Животное по имени " + name + " пробежало " + runDist + " метров");
        System.out.println();
    }

    public void ifSwim(int swimDist) {
        System.out.println("Животное по имени " + name + " проплыло " + swimDist + " метров");
        System.out.println();
    }
}

