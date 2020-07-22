import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int foodCount = 20;
        Cat[] arrCats = new Cat[5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {

            arrCats[i] = new Cat("Котяра" + i, 10 + rand.nextInt(10), false);
            System.out.println("Имя кота: " + arrCats[i].getName() + ", аппетит кота: " + arrCats[i].getAppetite() + ", кот наелся: " + arrCats[i].getFillCat());
        }
        Cat cat = new Cat("Васька", 10, false);
        Plate plate = new Plate(foodCount);
        plate.info();
        plate.increaseFood(40);
        cat.eat(plate);
        plate.info();
        cat.setAppetite(cat.getAppetite() - foodCount <= 0 ? 0 : cat.getAppetite() - foodCount);

        for (int i = 0; i < 5; i++) {
            arrCats[i].eat(plate);
        }
    }
}
