import java.util.Random;

public class Main {
    public static void main(String[] args) {

          //int foodCount = 22;
        Random randFood = new Random();
        int foodCount = randFood.nextInt(40) + 10;

        Cat[] arrCats = new Cat[5];
        for (int i = 0; i < arrCats.length; i++) {
            arrCats[0] = new Cat("Васька", 10, false);
            arrCats[1] = new Cat("Черныш", 15, false);
            arrCats[2] = new Cat("Пушок", 12, false);
            arrCats[3] = new Cat("Семен", 13, false);
            arrCats[4] = new Cat("Шершень", 7, false);

            //System.out.println("Имя кота: " + arrCats[i].getName() + ", аппетит кота: " + arrCats[i].getAppetite() + ", кот наелся: " + arrCats[i].getFillCat());
        }

        Cat cat = new Cat("Васька", 10, false);
        Plate plate = new Plate(foodCount);
        plate.info();
        plate.increaseFood(30);
        cat.eat(plate);
        plate.info();
        cat.setAppetite(cat.getAppetite() - foodCount <= 0 ? 0 : (cat.getAppetite() - foodCount));

        for (int i = 0; i < 5; i++) {
            arrCats[i].eat(plate);
        }
    }
}
