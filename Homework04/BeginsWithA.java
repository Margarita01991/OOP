package Homework04;

public class BeginsWithA implements IsGood<String> {
    @Override
    public boolean isGood(String item) {
        return item.indexOf("A")==0;
    }
}
