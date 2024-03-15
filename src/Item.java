public class Item {
    protected String itemDescription;
    protected String itemName;

    //****CONSTRUCTOR*****
    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public String toString() {
        return itemName + ", " + itemDescription;
    }
}
