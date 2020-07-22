public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("В тарелке " + food  + " еды достаточно");
    }
    public void decreaseFood(int appetite) {
        if (appetite > food) {
            food  = 0;
        } else {
            food -= appetite;
        }
    }
    public void increaseFood(int incFood) {
        food += incFood;
        System.out.println("Добавить в тарелку " + incFood);
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
}


