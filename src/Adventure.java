public class Adventure {
    //Controller
    private Player player;
    private Map map = new Map();
    private Music music = new Music();

    public Adventure() {
        map.mapCreator();
        player = new Player(map.getStarterRoom());
    }

    public void goNorth() {
        player.goNorth();
    }

    public void goSouth() {
        player.goSouth();
    }

    public void goEast() {
        player.goEast();
    }

    public void goWest() {
        player.goWest();
    }

    public Player getPlayer() {
        return player;
    }


    public void getCurrentRoomPrint() {
        player.currentRoomPrint();
    }

    public Item getaddPlayerItem(String itemName) {
        return player.pickedItem(itemName);
    }

    public Item getdropPlayerItem(String itemName) {
        return player.dropItem(itemName);
    }

    public void printItemList() {
        getCurrentRoom().printRoomItemList();
    }

    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public String getEat(String itemName) {
        return player.eat(itemName);
    }

    public String getEquipWeapon(String itemName) {
        return player.equipWeapon(itemName);
    }


    public void getPlayMusic() {
        music.playMusic();
    }

    public void getStop() {
        music.stopMusic();
    }


    public void attack() {
        if (player.getCurrentRoom().getEnemyList().isEmpty()) {
            System.out.println("no enemy to attack");
        } else {
            Enemy enemy = player.getCurrentRoom().getEnemyList().get(0);
            if (player.getCurrentWeapon() instanceof RangedWeapons) {
                int currentAmmo = ((RangedWeapons) player.getCurrentWeapon()).getAmmo();
                if (currentAmmo < 1) {
                    System.out.println("no ammo");
                } else {
                    ((RangedWeapons) player.getCurrentWeapon()).setAmmo(currentAmmo - 1);
                    enemy.setHp(enemy.getHp() - player.getCurrentWeapon().getDamage());
                    enemy.isEnemyDead();

                    if (enemy.getHp() > 0) {
                        System.out.println("weapon fired");
                        enemy.setHp(enemy.getHp() - ((RangedWeapons) player.getCurrentWeapon()).getDamage());
                        System.out.println("You attack with your weapon and deal '"
                                + ((RangedWeapons) player.getCurrentWeapon()).getDamage()+ "'");

                        System.out.println("The enemy attacks with their weapon '" + enemy.getWeapon() + "'");
                        System.out.println("The enemy dealt '" + enemy.getWeapon().getDamage() + "' damage");
                        player.setHealth(player.getHealth() - enemy.getWeapon().getDamage());
                        player.isPlayerDead();
                    }
                }
            }
            if (player.getCurrentWeapon() instanceof MeleWeapons) {
                enemy.setHp(enemy.getHp() - player.getCurrentWeapon().getDamage());
                enemy.isEnemyDead();

                if (enemy.getHp() > 0) {

                    System.out.println("attacked");
                    enemy.setHp(enemy.getHp() - ((MeleWeapons) player.getCurrentWeapon()).getDamage());
                    System.out.println("You attack with your weapon and deal "
                            + " '" + ((MeleWeapons) player.getCurrentWeapon()).getDamage()+"'" + "damage");
                }
                System.out.println("The enemy attacks with their weapon '" + enemy.getWeapon() + "'");
                System.out.println("The enemy dealt '" + enemy.getWeapon().getDamage() + "' damage");
                player.setHealth(player.getHealth() - enemy.getWeapon().getDamage());
                player.isPlayerDead();

            } else {
                System.out.println("not a weapon");
            }
        }
    }
}
