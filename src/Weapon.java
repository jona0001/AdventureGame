public abstract class Weapon extends Item{
    protected int damage;
    protected int ammo;

    public Weapon(String itemName, String itemDescription, int damage){
        super (itemName, itemDescription);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
    public int getAmmo(){
        return ammo;
    }

}
