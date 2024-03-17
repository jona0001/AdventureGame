public class RangedWeapons extends Weapon {
    private int ammo;

    public RangedWeapons (String itemName, String itemDescription, int damage, int ammo) {
        super(itemName, itemDescription, damage);
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public void attack() {
        if (ammo > 0) {
            setAmmo(ammo - 1);
        }
    }

}
