package course1.lesson5;

public class DemoApp {


    public static void main(String[] args) {

        Car car = new Car("Dodge", 2020);
        Car.wheelsNumber = 4;


        car.info();
        car.printModel();
        String carModel = car.getModel();
        car.crash();



        //car.year = -100;

      /*  Car car2 = new Car();
        car2.model = "Ford";
        car2.year = 1990;
        Car.wheelsNumber = 6;

        System.out.println("Model = " + car.model + " Year = " + car.year + " Was crashed = " + car.wasCrashed + " Wheels Number = " + car.wheelsNumber);
        System.out.println("Model = " + car2.model + " Year = " + car2.year + " Was crashed = " + car2.wasCrashed + " Wheels Number = " + Car.wheelsNumber);

        int wheelsNumber = Car.wheelsNumber;

        Car[] cars = new Car[]{car, car2};
        */
    }
}
