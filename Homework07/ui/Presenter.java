package Homework07.ui;

import java.util.Scanner;

import Homework07.model.Model;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    public void start() {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            view.showMenu();
            int menuChoice = in.nextInt();
            switch (menuChoice) {
                case (1):
                    view.showAllContacts(model.getCounterAgents());
                    break;
                case (2):
                    System.out.println("Введите имя контрагента:");
                    String name = in.next();
                    view.showCounterAgent(model.findAgent(name));
                    break;
                case (3):
                    System.out.println("Введите наименование контрагента:");
                    String newName = in.next();
                    model.addAgent(newName, view.contactMenu(in));
                    System.out.println("\u001B[42mКонтрагент добавлен\u001b[0m");
                    System.out.println("......................");
                    break;
                case (4):
                    System.out.println("Удаление контрагента:");
                    String removeName = in.next();
                    model.removeAgent(removeName);
                    System.out.println("\u001B[42mКонтрагент удален\u001b[0m");
                    System.out.println("......................");
                    break;
                case (5):
                    model.addContact(view.getContactName(in), view.contactMenu(in));
                    System.out.println("\u001B[42mНовый способ связи добавлен\u001b[0m");
                    System.out.println("......................");
                    break;
                case (6):
                    model.removeContact(view.getContactName(in), view.getContactValue(in));
                    System.out.println("\u001B[42mСпособ связи удален\u001b[0m");
                    System.out.println("......................");
                    break;
            }
        }
        in.close();
    }
}
