package Homework02;

/*Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, 
которые записывают в файл информацию о студентах в разных формах:

Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6 */

import java.util.HashMap;
import java.util.Map;

import Homework02.writer.WriterJSON;
import Homework02.writer.WriterTXT;
import Homework02.writer.WriterXML;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> list = new HashMap<>();
        list.put("Ivan Ivanov", 4.8);
        list.put("Maria Kuznecova", 5.0);
        list.put("Stepan Kuzmin", 3.6);

        WriterTXT formatTXT = new WriterTXT();
        formatTXT.FileWriter(list);

        WriterJSON formatJSON = new WriterJSON();
        formatJSON.FileWriter(list);

        WriterXML formatXML = new WriterXML();
        formatXML.FileWriter(list);
    }
}