package course_algo.homework2;

import java.util.Comparator;
import java.util.List;

public class NoteArraySort extends SelectionSort {

    public static List<NoteBook> sort(List<NoteBook> noteBooks) {

        int min = 0;
        for (int i = 0; i < noteBooks.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < noteBooks.size(); j++) {
                if (noteBooks.get(j).compareTo(noteBooks.get(min)) < 0) {
                    min = j;
                }

            }
            if (i == min) {
                continue;
            }
            NoteBook tmp = noteBooks.get(i);
            noteBooks.set(i, noteBooks.get(min));
            noteBooks.set(min, tmp);

        }
        return noteBooks;
    }

    public static List<NoteBook> sortNotePrice(List<NoteBook> noteBooks) {
        Comparator<NoteBook> c = Comparator.comparing(NoteBook::getPrice).thenComparing(NoteBook::getRam).thenComparing(NoteBook::getBrand);
        noteBooks.sort(c);
        return noteBooks;
    }

    public static List<NoteBook> sortNoteRam(List<NoteBook> noteBooks) {
        Comparator<NoteBook> c = Comparator.comparing(NoteBook::getRam).thenComparing(NoteBook::getBrand).thenComparing(NoteBook::getPrice);
        noteBooks.sort(c);
        return noteBooks;
    }

    public static List<NoteBook> sortNoteBrand(List<NoteBook> noteBooks) {
        Comparator<NoteBook> c = Comparator.comparing(NoteBook::getBrand).thenComparing(NoteBook::getRam).thenComparing(NoteBook::getPrice);
        noteBooks.sort(c);
        return noteBooks;
    }

}