package course1.lesson5;

public class Car {


    public static int wheelsNumber = 0;
    //fields
    private String model;
    //private String modelFull;
    private int year;
    private boolean wasCrashed;



    //constructor
    public Car(String model, int year, boolean wasCrashed) {
        this.model = model;
        this.year = year;
        this.wasCrashed = wasCrashed;
    }
    public Car(String model_, int year_) {
        this(model_, year_, false);
        /* model = model_;
        year = year_;

        wasCrashed = false;
         */
    }
    public Car(String model) {
        this(model, 2020);
    }



    /**
     * Выводит на экран информацию о машине
     */

    public void info() {
        System.out.println("Model = " + model + " Year = " + year + " Was crashed = " + wasCrashed);

    }

    public void printModel() {
        System.out.println(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Error");
        }
    }

    public boolean isWasCrashed() {
        return wasCrashed;
    }

    public void setWasCrashed(boolean wasCrashed) {
        this.wasCrashed = wasCrashed;
    }

    /**
     * Попали в аварию
     */
    public void crash() {
        System.out.println("car was crashed");
        wasCrashed = true;
    }

    public void repair() {
        if (wasCrashed) {

            wasCrashed = false;
            System.out.println("Was repaired");

        } else {
            System.out.println("Nothing to repair");
        }
    }
}
