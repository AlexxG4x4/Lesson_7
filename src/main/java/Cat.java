public class Cat {

    private String name;
    private int appetite;
    boolean fillCat;

    public Cat(String name, int appetite, boolean fillCat) {
        this.name = name;
        this.appetite = appetite;
        this.fillCat = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            fillCat = true;
            System.out.println("Кот " + name + " съел " + appetite + " единиц корма ");
            System.out.println("Кот " + name + " наелся!");
        } else {
            System.out.println("Не достаточно еды в тарелке! Кот " + name + " хочет есть " + appetite + " единиц корма!");
            System.out.println("А корма в тарелке всего: " + plate.getFood() + " единиц!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getFillCat() {
        return fillCat;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
