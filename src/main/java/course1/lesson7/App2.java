package course1.lesson7;

public class App2 {


    public static void main(String[] args) {
        Car2 car = new Car2(60);
        Car2 car2 = new Car2(100);
        GasStation gasStation = new GasStation(1000);

        gasStation.info();

        car.takeGasoline(gasStation);
        car2.takeGasoline(gasStation);

        gasStation.info();
    }
}
