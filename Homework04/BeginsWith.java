package Homework4;

public class BeginsWith implements IsGood<String> {

    private String saveString;

    public BeginsWith(String saveString) {
        this.saveString = saveString;
    }
    @Override
    public boolean isGood(String item) {
        return item.startsWith(saveString);
    }
}