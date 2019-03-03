public class Dog extends Animal {

    @Override
    public void run(int runLength) {

        if (runLength <= rnd(300, 600)) {
            System.out.println("Собака пробежала " + runLength + " метров");
        } else System.out.println("Собака не смогла пробежать " + runLength + " метров.\n");
    }

    @Override
    public void swim(int swimLength) {
        if (swimLength <= rnd(5, 15)) {
            System.out.println("Собака пробежала " + swimLength + " метров");
        } else System.out.println("Собака не смогла пробежать " + swimLength + " метров.\n");

    }

    @Override
    public void jump(int jumpLength) {
        if (jumpLength <= rnd(1, 3)) {
            System.out.println("Собака пробежала " + jumpLength + " метров");
        } else System.out.println("Собака не смогла пробежать " + jumpLength + " метров.\n");

    }

}
