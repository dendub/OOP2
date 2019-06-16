public class Gym1 extends GymNetwork {
    private String cityAdress;
    private String sectionName1;
    private String SectionName2;
    private int numberOfInventory;

    public Gym1(String gymName1_, String gymName2_, String country_, String cityAdress_, String sectionName1_, String SectionName2_, int numberOfInventory_) {
        super(gymName1_,gymName2_,country_);
        cityAdress = cityAdress_;
        sectionName1 = sectionName1_;
        SectionName2 = SectionName2_;
        numberOfInventory = numberOfInventory_;
    }
    public Gym1(int numberOfInventory_) {
        super();
        numberOfInventory=numberOfInventory_;
    }

    public String getCityAdress() {
        return cityAdress;
    }

    public void setCityAdress(String cityAdress) {
        this.cityAdress = cityAdress;
    }

    public String getSectionName1() {
        return sectionName1;
    }

    public void setSectionName1(String sectionName1) {
        this.sectionName1 = sectionName1;
    }

    public String getSectionName2() {
        return SectionName2;
    }

    public void setGetSectionName2(String SectionName2) {
        this.SectionName2 = SectionName2;
    }

    public int getNumberOfInventory() {
        return numberOfInventory;
    }

    public void setNumberOfInventory(int numberOfInventory) {
        this.numberOfInventory = numberOfInventory;
    }
}
