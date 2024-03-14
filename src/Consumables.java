public class Consumables extends Item {
    int healingPoint;

    public Consumables(String itemName, String itemDescription, int healingPoint){
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


