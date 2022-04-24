package course2.lesson1;

import course1.lesson6.Example;

public class InterfacesExample {

    public static void main(String[] args) {
        Car car = new Car();
        car.move(100);

        Moving ork = new Ork();
        ork.move(500);

        Moving[] units = {

                new Ork(),
                new Car(),
                new Plane(),
                new Dog(),
                new Dog(),
                new Dog(),
                new Car(),
                new Moving() {
                    @Override
                    public void move(int length) {
                        System.out.println("Anon moves");
                    }
                },
                l -> System.out.println("Lambda move"),
                length -> System.out.println("Lambda mooooove")
        };
        for (Moving unit : units) {

            unit.move(500);
            if (unit instanceof Attacking) {
                ((Attacking) unit).attack();
            }
        }

        System.out.println(ExampleMultiInterface.INTERFACE_FIELD);

        SomeUnit unit = new SomeUnit();
        unit.defaultMethod();


        ExampleMultiInterface.doStatic();
    }
}
