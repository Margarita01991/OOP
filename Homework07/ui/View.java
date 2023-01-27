package Homework07.ui;

import java.util.List;
import java.util.Scanner;

import Homework07.model.Agent;
import Homework07.model.Base.AddressContact;
import Homework07.model.Base.Contact;
import Homework07.model.Base.EmailContact;
import Homework07.model.Base.PhoneContact;
import Homework07.model.Base.TelegrammContact;
import Homework07.model.Base.VKContact;

public class View {
    private void showContactMenu() {
        System.out.println("Выберите тип способа связи:");
        System.out.println("  1 - Телефон");
        System.out.println("  2 - Email");
        System.out.println("  3 - VK");
        System.out.println("  4 - Telegram");
        System.out.println("  5 - Адрес");
    }
    public void showCounterAgent(List<Agent> counterAgents) {
        if (counterAgents.isEmpty()) {
            System.out.println("Контрагентов по запросу не найдено.");
        } else {
            for (Agent CounterAgent : counterAgents) {
                System.out.println(CounterAgent.toString());
                System.out.println("......................");
            }
        }
    }
    public void showAllContacts(List<Agent> counterAgents) {
        System.out.println("......................");
        if (counterAgents.isEmpty()) {
            System.out.println("Контрагентов по запросу не найдено.");
        } else {
            for (Agent counterAgent : counterAgents) {
                System.out.println(counterAgent.getName());
                System.out.println("......................");
            }
        }
    }
    public void showMenu() {
        System.out.println("Выберите пункт меню: ");
        System.out.println("1 - Посмотреть список всех контрагентов");
        System.out.println("2 - Найти контрагента");
        System.out.println("3 - Добавить контрагента");
        System.out.println("4 - Удалить контрагента");
        System.out.println("5 - Добавить новый способ связи с контрагентом");
        System.out.println("6 - Удалить способ связи с контрагентом");
        System.out.println("\u001b[1;31m.......................................\u001b[0m");
    }
    public Contact contactMenu(Scanner sc) {
        showContactMenu();
        int addContactMenuChoice = sc.nextInt();
        String value = "";
        Contact contact = null;
        switch (addContactMenuChoice) {
            case 1:
                System.out.println("Введите номер телефона:");
                value = sc.next();
                contact = new PhoneContact(value);
                break;
            case 2:
                System.out.println("Введите адрес Email:");
                value = sc.next();
                contact = new EmailContact(value);
                break;
            case 3:
                System.out.println("Введите id VK:");
                value = sc.next();
                contact = new VKContact(value);
                break;
            case 4:
                System.out.println("Введите id Telegram:");
                value = sc.next();
                contact = new TelegrammContact(value);
                break;
            case 5:
                System.out.println("Введите адрес:");
                value = sc.next();
                contact = new AddressContact(value);
                break;
        }
        return contact;
    }
    public String getContactName(Scanner sc) {
        System.out.println("Введите имя контрагента, для изменения способа связи:");
        String getContactName = sc.next();
        return getContactName;
    }
    public String getContactValue(Scanner sc) {
        System.out.println("Введите данные, который хотете удалить: ");
        return sc.next();
    }
}
