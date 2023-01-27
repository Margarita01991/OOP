package Homework07.model.Base;

public class VKContact implements Contact {
    private String name;

    public VKContact(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "VK nickname: " + name;
    }
    @Override
    public String getName() {
        return name;
    }
}
