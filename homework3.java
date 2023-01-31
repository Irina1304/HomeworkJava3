import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*1) Создать новый список, добавить несколько строк и вывести коллекцию на экран.
2) Итерация всех элементов списка цветов и добавления к каждому символа '!'.
3) Вставить элемент в список в первой позиции.
4) Извлечь элемент (по указанному индексу) из заданного списка.
5) Обновить определенный элемент списка по заданному индексу.
6) Удалить третий элемент из списка.
7) Поиска элемента в списке по строке.
8) Создать новый список и добавить в него несколько елементов первого списка.
9) Удалить из первого списка все элементы отсутствующие во втором списке.
10) *Сортировка списка.*/

public class homework3 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Создать новый список, добавить несколько строк и вывести коллекцию на экран.

        List list = new ArrayList();
        list.add("New list");
        list.add(1000);
        list.add("green");
        System.out.println(list);


        //Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        ArrayList<String> list2 = new ArrayList<> ();
        list2.add("green");
        list2.add("yellou");
        list2.add("pink");
        list2.add("red");
        list2.add("black");
        list2.add("blue");
        list2.add("grey");
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            String s = new String();
            s = (String) list2.get(i);
            s = s + "!";
            list2.set(i, s);
        }
        System.out.println(list2);


        //Вставить элемент в список в первой позиции.

        list2.add(0, "white!");
        System.out.println(list2);

        //Извлечь элемент (по указанному индексу) из заданного списка.

        System.out.println(list2.get(5));

        // Обновить определенный элемент списка по заданному индексу.

        list2.set(6, "brown");
        System.out.println(list2);

        // Удалить третий элемент из списка.

        list2.remove(2);
        System.out.println(list2);


        //Поиска элемента в списке по строке.

        System.out.println(list2.indexOf("pink!"));


        //Создать новый список и добавить в него несколько елементов первого списка.

        ArrayList<String> list3 = new ArrayList<> ();
        list3.add("green!");
        list3.add("pink!");
        list3.add("red!");
        list3.add("black!");
        System.out.println(list3);

        //Удалить из первого списка все элементы отсутствующие во втором списке.

        list2.retainAll(list3);
        System.out.println(list2);

        //Сортировка списка

        Collections.sort(list3);
        System.out.println(list3);

    }
    
}
