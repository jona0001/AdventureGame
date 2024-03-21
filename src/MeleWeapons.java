public class MeleWeapons extends Weapon {


    public MeleWeapons (String itemName, String itemDescription, int damage) {
        super(itemName, itemDescription, damage);
    }


    @Override
    public String uses() {
        return "unlimited uses";
    }

    @Override
    public void useWeapon() {
    }


}
