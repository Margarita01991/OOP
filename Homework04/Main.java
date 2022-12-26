package Homework04;

/*Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
• IsPositive — ему дают целое число, он одобряет его, если оно положительное
• BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
• BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
Продемонстрируйте, что это работает.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
		integerList.add(3);
		integerList.add(-3);
		integerList.add(-34);
		integerList.add(21);
		integerList.add(12);
		integerList.add(-36);
		integerList.add(12);
		integerList.add(-72);
        integerList.add(12);
        integerList.add(17);

        IsGood<Integer> isGoodInteger = new IsEven();
        System.out.println(filter(integerList, isGoodInteger) + "\n");

        IsGood<Integer> isGoodPositive = new IsPositive();
        System.out.println(filter(integerList, isGoodPositive) + "\n");

        List<String> stringList = new ArrayList<>();
		stringList.add("rut assda");
		stringList.add("Asd ruas");
		stringList.add("rut sjh");
		stringList.add("rut gsdd");
		stringList.add("adsas asjk");
		stringList.add("asdz j78");

        IsGood<String> isGoodBeginsWithA = new BeginsWithA();
        System.out.println(filter(stringList, isGoodBeginsWithA) + "\n");

        IsGood<String> isGoodBegins = new BeginsWith("rut");
        System.out.println(filter(stringList, isGoodBegins) + "\n");
    }
    private static <T> List<T> filter(Iterable<T> array, IsGood<T> isGood) {
        List<T> newList = new ArrayList<>();
        for (T item : array) {
            if (isGood.isGood(item) == true) {
                newList.add(item);
            }
        }
        return newList;
    }
}
