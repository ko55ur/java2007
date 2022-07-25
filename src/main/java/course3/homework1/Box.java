package course3.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<F extends Fruit> {

    private final List<F> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public Box(List<F> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public Box(F... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));

    }

    public void add(F fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compareWeight(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void shiftFruits(Box<? super F> another) {
        if (this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public List<F> getFruits() {
        return fruits;
    }

}
