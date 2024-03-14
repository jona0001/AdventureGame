public class Weapon extends Item{
    int damage;

    public Weapon(String itemName, String itemDescription, int damage){
        super (itemName, itemDescription);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

}
