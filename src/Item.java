public class Item {
    private String itemDescription;
    private String itemName;

    //****CONSTRUCTOR*****
    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    //****SETTER****
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //****GETTER****
    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    public String toString() {
        return itemDescription;
    }
}
