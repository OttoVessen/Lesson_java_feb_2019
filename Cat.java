public class Cat extends Animal {


    @Override
    public void run(int runLength) {
        if (runLength <= rnd(100, 300)) {
            System.out.println("Кошка пробежала " + runLength + " метров");
        } else System.out.println("Кошка не смогла пробежать " + runLength + " метров.\n");
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Вы не заставите кошку проплыть "+swimLength+" метров, без вариантов");
    }

    @Override
    public void jump(int jumpLength) {
        if (jumpLength <= rnd(2, 6)) {
            System.out.println("Кошка прыгнула на " + jumpLength + " метров");
        } else System.out.println("Кошка не смогла прыгнуть на " + jumpLength + " метров.\n");

    }
}
