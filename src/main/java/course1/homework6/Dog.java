package course1.homework6;

public class Dog extends Animal {


    public Dog(int run, int swim, String name) {
        super(run, swim, name);
        if (swim <= 10) {
            this.swim = swim;
            if(swim < 0) {
                System.out.println("Нельзя использовать отрицательные числа");
            }

        } else System.out.println(name + " не может столько проплыть");
        if(run <= 500) {
            this.run = run;
            if (run < 0) {
                System.out.println("Нельзя использовать отрицательные числа");
            }
        } else System.out.println(name + " не может столько пробежать");
    }
}