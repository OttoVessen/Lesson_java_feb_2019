public class MainClass {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[7];
        catArray[0] = new Cat("Richi",20);
        catArray[1] = new Cat("Chara",23);
        catArray[2] = new Cat("Luna",50);
        catArray[3] = new Cat("Serjoga",40);
        catArray[4] = new Cat("Bublik",27);
        catArray[5] = new Cat("Timocha",28);
        catArray[6] = new Cat("Batman",25);
        Plate plate = new Plate(200);
        plate.info();
        for (int i = 0; i <catArray.length ; i++) {

            catArray[i].eat(plate);
            plate.info();


        }

        System.out.println();

        plate.info();
        catArray[2].eat(plate);
        plate.info();
        plate.addFood(60);
        plate.info();
        catArray[2].eat(plate);
        plate.info();

    }


}
