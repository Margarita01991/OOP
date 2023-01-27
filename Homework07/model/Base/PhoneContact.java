package Homework07.model.Base;

public class PhoneContact implements Contact {
    private String name;

    public PhoneContact(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Phone: " + name;
    }
    @Override
    public String getName() {
        return name;
    }
}
