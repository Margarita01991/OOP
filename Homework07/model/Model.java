package Homework07.model;

import java.util.ArrayList;
import java.util.List;

import Homework010.Person;
import Homework07.model.Base.Contact;

public class Model {
    private List<Agent> counterAgents;

    public List<Agent> getCounterAgents() {
        return counterAgents;
    }
    public Model(List<Agent> counterAgents) {
        this.counterAgents = counterAgents;
    }
    public List<Agent> findAgent(String name) {
        List<Agent> foundAgents = new ArrayList<>();
        for (Agent counterAgent : counterAgents) {
            if (counterAgent.getName().equalsIgnoreCase(name)) {
                foundAgents.add(counterAgent);
            }
        }
        return foundAgents;
    }
    public void addAgent(String name, Contact contact) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        counterAgents.add(new Person(name, contacts));
    }
    public void removeAgent(String name) {
        counterAgents.removeAll(findAgent(name));
    }
    public void addContact(String name, Contact contact) {
        for (Agent counterAgent : findAgent(name)) {
            counterAgent.addContact(contact);
        }
    }
    public void removeContact(String name, String value) {
        for (Agent counterAgent : findAgent(name)) {
            Contact contactForRemove = null;
            for (Contact contact : counterAgent.getContacts()) {
                if (contact.getName().equalsIgnoreCase(value)) {
                    contactForRemove = contact;
                    break;
                } 
            }
            counterAgent.getContacts().remove(contactForRemove);
        }
    }
}
