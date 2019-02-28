public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFood(int h) {
        this.food+=h;
    }

    public void decreaseFood(int n) {
        if (n > food) {
            System.out.println("В миске нет столько еды");
            Cat.satiety= false;
        } else {
            food -= n;
            Cat.satiety = true;
        }
    }

    public void info() {
        System.out.println(" Количество еды в тарелке " + food + " Сытость: " + Cat.satiety);
    }


}
