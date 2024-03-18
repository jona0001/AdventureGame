public class RangedWeapons extends Weapon {
    private int ammo;

    public RangedWeapons(String itemName, String itemDescription, int damage, int ammo) {
        super(itemName, itemDescription, damage, ammo);
    }

    @Override
    public String uses() {
        if (super.getAmmo() >= 0) {
            return "remaning uses: " + super.getAmmo();
        } else {
            return "out of ammo";
        }
    }

    @Override
    public void useWeapon() {
        if (getAmmo() > 0) {
            setAmmo(getAmmo() - 1);
        } else {
            System.out.println("No ammo remaining for " + getItemName() + ".");
        }
    }


}
