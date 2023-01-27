package Homework07.model.Base;

public class AddressContact implements Contact {
    private String name;

    public AddressContact(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Address: " + name;
    }
    @Override
    public String getName() {
        return name;
    }
}
