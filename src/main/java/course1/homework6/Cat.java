package course1.homework6;

public class Cat extends Animal {
    public Cat(int run, int swim, String name) {
        super(run, swim, name);
        if (swim >= 0) {
            System.out.println(name + " не умеет плавать");
        }
        if(run >= 200) {
            System.out.println(name + " не может столько пробежать");
        }
    }

}