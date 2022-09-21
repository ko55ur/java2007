package course_algo.homework2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestNoteSort {

    private static final int NOTEBOOK_COUNT = 10;

    public static void main(String[] args) {
        List<NoteBook> noteBooks = generateListNotebooks();

        displayNotebooks(NoteArraySort.sortNotePrice(noteBooks));
        displayNotebooks(NoteArraySort.sortNoteRam(noteBooks));
        displayNotebooks(NoteArraySort.sortNoteBrand(noteBooks));

    }

    private static void displayNotebooks(List<NoteBook> list) {
        for (NoteBook n : list) {
            System.out.printf("Notebook:\tprice: %s,\tRAM: %s,\tbrand: %s%n", n.getPrice(), n.getRam(), n.getBrand());
        }
    }

    private static ArrayList<NoteBook> generateListNotebooks() {
        ArrayList<NoteBook> arrayList = new ArrayList<>();
        for (int i = 0; i < NOTEBOOK_COUNT; i++) {
            arrayList.add(createNotebook());
        }
        return arrayList;
    }

    private static NoteBook createNotebook() {
        Random random = new Random();
        double price = 100 + (700 - 100) * random.nextDouble();
        int ram = (random.nextInt(2) + 2) * 2;
        int brandsCount = NoteBook.Brand.values().length;
        NoteBook.Brand brand = NoteBook.Brand.values()[random.nextInt(brandsCount)];
        return new NoteBook(brand, price, ram);
    }

}
