package Homework07.model;

import java.util.List;

import Homework07.model.Base.Contact;

public class Agent {
    protected String name;
    protected List<Contact> contacts;

    public String getName() {
        return name;
    }
    public Agent(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }
    public List<Contact> getContacts() {
        return contacts;
    }
    public void addContact(Contact contact) {
        contacts.add(contact);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        if (contacts != null) {
            for (Contact contact : contacts) {
                sb.append("  " + contact.toString() + "\n");
            }
        }
        return sb.toString();
    }
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
