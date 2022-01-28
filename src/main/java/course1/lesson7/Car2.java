package course1.lesson7;

public class Car2 {

    /**
     * Объём бензобака
     */
    private int volume;

    public Car2(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void takeGasoline(GasStation station) {
        station.refill(volume);
    }

    public void findGasoline(GasStation[] stations) {
        for (GasStation station : stations
                ) {
            if (station.getAvailable() < volume) {
                continue;
            }
            station.refill(volume);
            break;
        }
    }

}
