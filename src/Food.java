public class Food extends Item {
    int healingPoint;

    public Food(String itemName, String itemDescription, int healingPoint){
        super (itemName, itemDescription);
        this.healingPoint = healingPoint;
    }

    public String toString() {
        return super.toString() + " (" + healingPoint + "HP)";
    }

    public int getHealingPoint() {
        return healingPoint;
    }
}


