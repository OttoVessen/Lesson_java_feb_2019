public class Animal {

    public  void run(int runLength) {
        System.out.println("Животное пробежало "+runLength+" метров");
    }


    public  void swim(int swimLength) {
        System.out.println("Животное проплыло на "+swimLength+" метров");

    }

    public  void jump(int jumpLength) {
        System.out.println("Животное прыгнуло на "+jumpLength+" метров");

    }


    // Получение псевдо-рандомного числа в заданном диапазоне. Используем для создания вариаций максимальных показателей животных.
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }



}
