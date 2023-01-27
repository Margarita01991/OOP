package Homework07.model.Base;

public class EmailContact implements Contact {
    private String name;

    public EmailContact(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Email: " + name;
    }
    @Override
    public String getName() {
        return name;
    }
}
