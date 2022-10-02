package course_algo.homework5;


    public class Item implements Comparable<Item> {
        private String name;
        private Integer weight;
        private Integer price;

        public Item(String name, Integer weight, Integer price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public Integer getWeight() {
            return weight;
        }

        public Integer getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Item{" + "name='" + name + '\'' + ", mass=" + weight + ", price=" + price + '}';
        }

        @Override
        public int compareTo(Item thing) {
            if (this == thing || this.equals(thing)) {
                return 0;
            }
            if (name.compareTo(thing.getName())>0) {
                return 1;
            } else if (name.compareTo(thing.getName())<0) {
                return -1;
            } else if (price > thing.getPrice()) {
                return 1;
            } else if (price < thing.getPrice()) {
                return -1;
            } else if (weight > thing.getWeight()) {
                return 1;
            } else if (weight < thing.getWeight()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
