public class Cat {
    public static String name;
    private int appetite;
    public static boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }



}
