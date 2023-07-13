package Task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Map<String, ArrayList<Long>> phonebook = new HashMap<String, ArrayList<Long>>();
        addNumber(phonebook);
        printPhoneBook(phonebook);

    }

    public static void addNumber(Map<String, ArrayList<Long>> phonebook) {
        for (int i = 0; i < 6; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите Фамилию : ");
            String name = scan.next();
            System.out.println("Введите Номер телефона : ");
            long value = scan.nextLong();
            if (phonebook.containsKey(name)) {
                phonebook.get(name).add(value);
            } else {
                ArrayList<Long> list = new ArrayList<Long>();
                list.add(value);
                phonebook.put(name, list);
            }

        }
    }

    public static void printPhoneBook(Map<String, ArrayList<Long>> phonebook) {
        ArrayList<Map.Entry<String, ArrayList<Long>>> list = new ArrayList<>(phonebook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<Long>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<Long>> o1, Map.Entry<String, ArrayList<Long>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        for (Map.Entry<String, ArrayList<Long>> phon : list) {
            System.out.println(phon.getKey() + ":" + phon.getValue());
        }
    }

}
