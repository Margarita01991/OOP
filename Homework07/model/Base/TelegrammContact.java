package Homework07.model.Base;

public class TelegrammContact implements Contact {
    private String name;

    public TelegrammContact(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Telegram nickname: " + name;
    }
    @Override
    public String getName() {
        return name;
    }
}