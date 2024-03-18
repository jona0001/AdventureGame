public abstract class Weapon extends Item{
    private int damage;
    private int ammo;


    public Weapon(String itemName, String itemDescription, int damage){
        super (itemName, itemDescription);
        this.damage = damage;
    }

    public Weapon(String itemName, String itemDescription, int damage, int ammo){
        super (itemName, itemDescription);
        this.damage = damage;
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public abstract String uses();
    public abstract void useWeapon();

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

}
