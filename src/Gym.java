public class Gym
{
    private String name;
    private String cityAdress;
    private int numberOfSections;
    private String sectionName1;
    private String sectionName2;
    private int numberOfInventory;

    public Gym(String name_, String cityAdress_, int numberOfSections_, String sectionName1_,String sectionName2_, int numberOfInventory_) {
        name = name_;
        cityAdress = cityAdress_;
        numberOfSections = numberOfSections_;
        sectionName1 = sectionName1_;
        sectionName2 = sectionName2_;
        numberOfInventory = numberOfInventory_;
    }

    public void addInventory(int a) {
        numberOfInventory = a + numberOfInventory;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityAdress() {
        return cityAdress;
    }

    public void setCityAdress(String cityAdress) {
        this.cityAdress = cityAdress;
    }

    public int getNumberOfSections() {
        return numberOfSections;
    }

    public void setNumberOfSections(int numberOfSections) {
        this.numberOfSections = numberOfSections;
    }

    public String getSectionName1() {
        return sectionName1;
    }

    public void setSectionName1(String sectionName1) {
        this.sectionName1 = sectionName1;
    }

    public String getSectionName2() {
        return sectionName2;
    }

    public void setSectionName2(String sectionName2) {
        this.sectionName2 = sectionName2;
    }

    public int getNumberOfInventory() {
        return numberOfInventory;
    }

    public void setNumberOfInventory(int numberOfInventory) {
        this.numberOfInventory = numberOfInventory;
    }
}
