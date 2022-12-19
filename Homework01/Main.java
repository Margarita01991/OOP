package Homework01;

/*При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.
Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.
Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и 
реализуйте перегруженный метод getProduct(int name, int volume, int temperature), в
ыдающий продукт, соответствующий имени, объему и температуре.
В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков 
и позвольте покупателю купить товар.*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<HotDrink> drinks = new LinkedList<>(List.of(
                new HotDrink(1, "Coffee", 200, 70),
                new HotDrink(1, "Coffee", 200, 80),
                new HotDrink(1, "Coffee", 200, 90),
                new HotDrink(1, "Coffee", 400, 70),
                new HotDrink(1, "Coffee", 400, 80),
                new HotDrink(1, "Coffee", 400, 90),
                new HotDrink(2, "Chocolate", 200, 70),
                new HotDrink(2, "Chocolate", 200, 80),
                new HotDrink(2, "Chocolate", 200, 90),
                new HotDrink(2, "Chocolate", 400, 70),
                new HotDrink(2, "Chocolate", 400, 80),
                new HotDrink(2, "Chocolate", 400, 90),
                new HotDrink(3, "Tea", 200, 70),
                new HotDrink(3, "Tea", 200, 80),
                new HotDrink(3, "Tea", 200, 90),
                new HotDrink(3, "Tea", 400, 70),
                new HotDrink(3, "Tea", 400, 80),
                new HotDrink(3, "Tea", 400, 90)));
        HotVendingMachine machine = new HotVendingMachine(drinks);
        machine.getDrink(getId(), getVolume(), getTemperature());
    }
    public static Integer getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: ");
        Integer drinkId = scanner.nextInt();
        return drinkId;
    }
    public static Integer getVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем напитка(200 мл, 400 мл): ");
        Integer drinkVolume = scanner.nextInt();
        return drinkVolume;
    }
    public static Integer getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру напитка(70°, 80°, 90°): ");
        Integer drinkTemperature = scanner.nextInt();
        return drinkTemperature;
    }
}