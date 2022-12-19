package Homework01;

public class HotDrink extends Drink {
    private Integer temperature;
    private Integer price;

    public HotDrink(Integer id, String name, Integer volume, Integer temperature) {
        super(id, name, volume);
        this.temperature = temperature;
    }
        public String toString() {
        return super.toString() + " HotDrink [temperature = " + temperature + " ] ";
    }
    public Integer getTemperature() {
        return temperature;
    }
    public Integer getPrice() {
        return price;
    }
}