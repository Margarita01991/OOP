package Homework07.main;

import java.util.ArrayList;
import java.util.List;

import Homework010.Person;
import Homework07.model.Agent;
import Homework07.model.Model;
import Homework07.model.Base.AddressContact;
import Homework07.model.Base.Contact;
import Homework07.model.Base.EmailContact;
import Homework07.model.Base.PhoneContact;
import Homework07.model.Base.TelegrammContact;
import Homework07.model.Base.VKContact;
import Homework07.ui.Presenter;
import Homework07.ui.View;

public class Main {
    public static void main(String[] args) {
        List<Agent> counterAgents = new ArrayList<>();
        List<Contact> tatyanaContacts = new ArrayList<>();
        tatyanaContacts.add(new PhoneContact("+79213523222"));
        tatyanaContacts.add(new TelegrammContact("tatyanazhukova@"));
        tatyanaContacts.add(new EmailContact("12345@mail.ru"));
        Person tatyana = new Person("tatyana", tatyanaContacts);
        List<Contact> annaContacts = new ArrayList<>();
        annaContacts.add(new AddressContact("пр.Космонавтов, д.5"));
        annaContacts.add(new VKContact("annapavlova"));
        annaContacts.add(new PhoneContact("+79112435526"));
        Person anna = new Person("anna", annaContacts);
        List<Contact> sergeyContacts = new ArrayList<>();
        sergeyContacts.add(new TelegrammContact("sergeyivanov@"));
        sergeyContacts.add(new VKContact("sergeyivanov"));
        sergeyContacts.add(new PhoneContact("+79213547287"));
        Person sergey = new Person("sergey", sergeyContacts);
        counterAgents.add(tatyana);
        counterAgents.add(anna);
        counterAgents.add(sergey);

        Presenter presenter = new Presenter(new View(), new Model(counterAgents));
        presenter.start();
    }
}
