import java.util.*;


public class Main {
    public static void main(String[] args) {


        // a. Создать ArrayList<String> (list1)
        ArrayList<String> list1 = new ArrayList<>();

        // b. Создать массив строк. Добавить в список все элементы массива (одним методом)
        String[] array = {"one", "two", "three", "four"};
        list1.addAll(Arrays.asList(array));
        System.out.println("list1: " + list1);


        // c. Создать новый (list2) ArrayList<String>, проинициализировав его предыдущим списком
        ArrayList<String> list2 = new ArrayList<>(list1);

        // d. Создать список (list3) используя Arrays.asList(…)
        List<String> list3 = Arrays.asList("five", "six", "seven", "eight");
        System.out.println("list3: " + list3);

        // e. Вставить list3 в середину list2
        int insertIndex = list2.size() / 2;
        list2.addAll(insertIndex, list3);
        System.out.println("Вставка list3 в list2: " + list2);

        // f. Отсортировать список по убыванию.
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println("Сортировка list2: " + list2);

        // g. *Удалить каждый второй элемент списка используя ListIterator
        ListIterator<String> listIterator = list2.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next(); // Первый элемент (пропускаем)
            if (listIterator.hasNext()) {
                listIterator.next(); // Второй элемент (удаляем)
                listIterator.remove();
            }
        }

        System.out.println("Удалили второй элемент list2: " + list2);

        System.out.println("\n");

        // a. Создать HashSet<String> (set1)
        HashSet<String> set1 = new HashSet<>();

        // b. Вставить в set1 2 произвольные строки
        set1.add("Hello");
        set1.add("World");

        // c. Вставить в set1 все элементы из list1 и list2
        set1.addAll(list1);
        set1.addAll(list2);

        // d. Вывести на экран значения set1
        System.out.println("set1: " + set1);

        // e. Создать LinkedHashSet<String> (set2)
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        // f. Вставить в set2 все элементы из list2 и list3
        set2.addAll(list2);
        set2.addAll(list3);

        // g. Вывести на экран значения set2
        System.out.println("set2: " + set2);


        System.out.println("\n");
        // a. Создать LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // b. Добавить в map значения всех месяцев года (номер месяца : название)
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        // c. Вывести на экран первый и последний месяц года (0 и 11)
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        // d. Вставить на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
        map1.put(6, "ОТПУСК");
        System.out.println("Значение 6-го месяца: " + map1.get(6));

        // e. Создать HashMap<Integer, String> (map2)
        HashMap<Integer, String> map2 = new HashMap<>();

        // f. Вставить в map2 все значения map1
        map2.putAll(map1);

        // g. *Создать метод для вывода всех элементов map в консоль (EntrySet< Integer, String >)
        printMap(map1, "map1");
        printMap(map2, "map2");

        // h. *Создать map3 (ключ – имя студента (String), значение -контакты студента:
        // моб.тел, почта, скайп (Set<String>))
        HashMap<String, Set<String>> map3 = new HashMap<>();

        // студент "Иван"
        Set<String> ivanContacts = new HashSet<>();
        ivanContacts.add("+380954567823");
        ivanContacts.add("ivan@ivan.com");
        ivanContacts.add("ivan_skype");
        map3.put("Ivan", ivanContacts);

        // студент "Катя"
        Set<String> katyaContacts = new HashSet<>();
        katyaContacts.add("+380934562356");
        katyaContacts.add("katya@katya.com");
        katyaContacts.add("katya_skype");
        map3.put("Katya", katyaContacts);

        // студент "Игорь"
        Set<String> igorContacts = new HashSet<>();
        igorContacts.add("+380669875321");
        igorContacts.add("igor@igor.com");
        igorContacts.add("igor_skype");
        map3.put("Igor", igorContacts);

        // Вывод данных
        for (Map.Entry<String, Set<String>> entry : map3.entrySet()) {
            System.out.println("Student: " + entry.getKey());
            System.out.println("Contacts: " + entry.getValue());
            System.out.println("--------------");
        }

    }

    // Метод для вывода всех элементов map в консоль
    private static void printMap(Map<Integer, String> map, String mapName) {
        System.out.println(mapName + ":");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}