package Homework06.Task02;
/*Задача 2. Есть два самодельных класса коллекций:

ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не меняется. Методы:
• getSize ()
• get (int i)

MutableList<T> — коллекция, которая допускает изменения. Методы:
• getSize ()
• get (int i)
• set (int i, T newValue)
• add (T newValue)
• remove (T value)

Реализуйте такую схему наследования между двумя этими классами, которая будет соответствовать принципу подстановки Лисков. */
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> lst2 = new LinkedList<>(Arrays.asList(22, 43, 55, 75, 88));
        ImmutableList immutableList = new ImmutableList(lst);
        immutableList.colList();
        immutableList.get(2);
        immutableList.get(3);
        immutableList.get(4);
        System.out.println();
        MutableList mutableList = new MutableList(lst2);
        mutableList.add(99);
        mutableList.add(101);
        mutableList.add(125);
        mutableList.colList();
        mutableList.get(3);
        mutableList.remove(3);
        mutableList.getSize();
        mutableList.colList();
    }
}
