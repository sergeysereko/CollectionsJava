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

        System.out.println("Удаляем второй элемент list2: " + list2);

    }
}