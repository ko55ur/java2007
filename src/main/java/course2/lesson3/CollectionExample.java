package course2.lesson3;



    import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

    public class CollectionExample {
        public static void main(String[] args) {
//        listsExample();
//        setExample();
            mapExample();

        }

        private static void mapExample() {
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new Hashtable<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
            Map<String, Integer> map = new TreeMap<>();
            map.put("A", null);
            map.put("B", 2);
            map.put("C", 3);
//        map.put("A", 5);
            map.putIfAbsent("A", 5);
            System.out.println(map);
            System.out.println(map.get("B"));
//        System.out.println(map.get("Z"));
            System.out.println(map.getOrDefault("Z", 99));
            map.replaceAll(new BiFunction<String, Integer, Integer>() {
                @Override
                public Integer apply(String s, Integer integer) {
                    return integer + 5;
                }
            });
//        System.out.println(map);
//        Set<String> keys = map.keySet();
//        System.out.println(keys);
//        Collection<Integer> values = map.values();
//        System.out.println(values);
//        System.out.println(map);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            var entries = map.entrySet();
            var iterator = entries.iterator();
            while (iterator.hasNext()) {
                var e = iterator.next();
                System.out.println(e.getKey() + " " + e.getValue());
            }
            map.forEach((k, v) -> System.out.println(k + " " + v));
        }

        private static void setExample() {
            Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
//        Set<String> set = new TreeSet<>();
//        set.add("January");
//        set.add("February");
////        set.add(null);
//        set.add("March");
//        set.add("February");
////        set.add(null);
//        set.addAll(Arrays.asList("June", "July", "May", "April"));
//        System.out.println(set);
//        set.remove("May");
//        set.removeAll(List.of("May", "April"));
//        set.removeIf(s -> s.length() < 5);
//        System.out.println(set);

//        for (String s : set) {
//            System.out.println(s);
//        }

//        Iterator<String> iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//        System.out.println(set);

//        set.forEach(System.out::println);

//        Set<Box> boxes = new HashSet<>();
//        Set<Box> boxes = new LinkedHashSet<>();
            Set<Box> boxes = new TreeSet<>(
                    (b1, b2) -> b1.width * b1.height - b2.width * b2.height);
            boxes.add(new Box(3, 3));
            boxes.add(new Box(1, 1));
            boxes.add(new Box(2, 2));
            boxes.add(new Box(1, 1));
//
            System.out.println(boxes);
        }

        private static void listsExample() {
//        List<String> list = new ArrayList<>();
//        list.add(123);
//        List<String> list = new Vector<>();
            List<String> list = new LinkedList<>();
            list.add("January");
            list.add("February");
//        list.add(null);
            list.add("March");
            list.add("February");
//        list.add(null);
//        System.out.println(list);
            list.add(3, "April");
//        System.out.println(list);
            list.set(4, "May");
//        System.out.println(list);
            list.addAll(Arrays.asList("June", "July", "May", "April", "September", "May", "October", "April"));
            System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        list.remove("May");
//        System.out.println(list);
//        list.removeAll(List.of("May", "April"));
//        System.out.println(list);
//        list.removeIf(s -> s.length() > 5);
//        System.out.println(list);
            list.sort(String::compareTo);
            System.out.println(list);
//        list.sort((e1, e2) -> e1.compareTo(e2));
//        list.replaceAll(s -> s + " month.");
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            list.remove(i);
//        }
//
//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(list.get(i));
//            list.remove(i);
//        }
//        System.out.println(list);
//        System.out.println(list.get(20));
//        for (String s : list) {
//            System.out.println(s);
////            list.remove(s);
//        }

//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//        System.out.println(list);

//        ListIterator<String> iterator = list.listIterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.remove();
//            iterator.hasPrevious();
////            iterator.previousIndex();
//        }

            list.forEach(System.out::println);
        }

        public static class Box implements Comparable<Box> {
            private int width;
            private int height;

            public Box(int width, int height) {
                this.width = width;
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            @Override
            public String toString() {
                return "Box{" +
                        "width=" + width +
                        ", height=" + height +
                        '}';
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Box box = (Box) o;
                return width == box.width && height == box.height;
            }

            //
            @Override
            public int hashCode() {
                return Objects.hash(width, height);
            }

//

            @Override
            public int compareTo(Box o) {
                return width * height - o.width * o.height;
            }
        }
    }

