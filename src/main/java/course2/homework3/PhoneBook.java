package course2.homework3;

import java.util.*;

public class PhoneBook {

    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addPhone(String name, String phone) {
        Set<String> phones = phoneBook.computeIfAbsent(name, k -> new HashSet<>());
        phones.add(phone);
    }

    public Set<String> getPhonesByName(String name) {
        return phoneBook.get(name);
    }

}

