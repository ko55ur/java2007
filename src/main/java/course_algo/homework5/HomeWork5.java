package course_algo.homework5;

/*
1. Написать программу по возведению числа в степень с помощью рекурсии.
2. Написать программу «Задача о рюкзаке» с помощью рекурсии.

 */

import java.util.*;

public class HomeWork5 {

    public static void main(String[] args) {
        List<Item> list = new LinkedList<>();
        list.add(new Item("AID", 2, 600));
        list.add(new Item("Book", 4, 4000));
        list.add(new Item("Binoculars", 3, 5500));
        list.add(new Item("Notebook", 1, 2000));
        list.add(new Item("Bowler", 8, 5600));

        System.out.println(solveBackPackProblem(list, 4));
    }

    public static Set<Item> solveBackPackProblem(List<Item> list, int backPackCapacity) {
        Set<Set<Item>> combinations = getAllCombinations(list);
        Iterator<Set<Item>> iterator = combinations.iterator();
        while (iterator.hasNext()) {
            Set<Item> temp = iterator.next();
            if (getWeight(temp) > backPackCapacity) {
                iterator.remove();
            }
        }
        return getCombination(combinations);
    }

    private static Set<Item> getCombination(Set<Set<Item>> combinations) {
        Set<Item> availableCombination = new TreeSet<>();
        Integer maxPrice = 0;
        for (Set<Item> combination : combinations) {
            if (getPrice(combination) >= maxPrice) {
                maxPrice = getPrice(combination);
                availableCombination = combination;
            }
        }
        return availableCombination;
    }

    private static Integer getWeight(Set<Item> combination) {
        Integer weight = 0;
        for (Item thing : combination) {
            weight = weight + thing.getWeight();
        }
        return weight;
    }

    private static Integer getPrice(Set<Item> combination) {
        Integer price = 0;
        for (Item thing : combination) {
            price = price + thing.getPrice();
        }
        return price;
    }

    private static Set<Set<Item>> getAllCombinations(List<Item> list) {
        Set<Set<Item>> results = new HashSet<>();
        for (int i = 1; i < list.size(); i++) {
            results.addAll(getCombinations(i, list));
        }
        return results;
    }

    private static Set<Set<Item>> getCombinations(int k, List<Item> list) {
        if (k > list.size()) {
            throw new IllegalArgumentException();
        }
        Set<Set<Item>> results = new HashSet<>();
        if (k == 0) {
            return results;
        }
        if (k == 1) {
            for (Item element : list) {
                Set<Item> result = new TreeSet<>();
                result.add(element);
                results.add(result);
            }
            return results;
        }
        for (int i = 0; i < list.size(); i++) {
            List<Item> newList = new LinkedList<>(list);
            newList.remove(list.get(i));
            Set<Set<Item>> sets = getCombinations(k - 1, newList);
            for (Set<Item> set1 : sets) {
                Set<Item> newSet1 = new TreeSet<>(set1);
                newSet1.add(list.get(i));
                results.add(newSet1);
            }
        }
        return results;
    }
}

