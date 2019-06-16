public class InventoryGym1 extends Gym1{
    private String inventoryType1;
    private String inventoryType2;
    private String inventoryType3;
    private int numberOfInvetory1;
    private int numberOfInvetory3;
    private int numberOfInvetory2;

    public InventoryGym1(int numberOfInventory_, String inventoryType1_, String inventoryType2_, String inventoryType3_, int numberOfInvetory1_, int numberOfInvetory2_, int numberOfInvetory3_) {
        super(numberOfInventory_);
        inventoryType1 = inventoryType1_;
        inventoryType2 = inventoryType2_;
        inventoryType3 = inventoryType3_;
        numberOfInvetory1=numberOfInvetory1_;
        numberOfInvetory2=numberOfInvetory2_;
        numberOfInvetory3=numberOfInvetory3_;
    }

    public String getInventoryType1() {
        return inventoryType1;
    }

    public void setInventoryType1(String inventoryType1) {
        this.inventoryType1 = inventoryType1;
    }

    public String getInventoryType2() {
        return inventoryType2;
    }

    public void setInventoryType2(String inventoryType2) {
        this.inventoryType2 = inventoryType2;
    }

    public String getInventoryType3() {
        return inventoryType3;
    }

    public void setInventoryType3(String inventoryType3) {
        this.inventoryType3 = inventoryType3;
    }

    public int getNumberOfInvetory1() {
        return numberOfInvetory1;
    }

    public void setNumberOfInvetory1(int numberOfInvetory1) {
        this.numberOfInvetory1 = numberOfInvetory1;
    }

    public int getNumberOfInvetory3() {
        return numberOfInvetory3;
    }

    public void setNumberOfInvetory3(int numberOfInvetory3) {
        this.numberOfInvetory3 = numberOfInvetory3;
    }

    public int getNumberOfInvetory2() {
        return numberOfInvetory2;
    }

    public void setNumberOfInvetory2(int numberOfInvetory2) {
        this.numberOfInvetory2 = numberOfInvetory2;
    }
}
