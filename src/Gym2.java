public class Gym2 extends GymNetwork {
    private String cityAdress1;
    private String sectionName11;
    private String SectionName12;
    private int numberOfInventory1;

    public Gym2(String gymName1_,String gymName2_, String country_, String cityAdress1_, String sectionName11_, String SectionName12_, int numberOfInventory1_) {
        super(gymName1_, gymName2_,country_);
        this.cityAdress1 = cityAdress1_;
        this.sectionName11 = sectionName11_;
        this.SectionName12 = SectionName12_;
        this.numberOfInventory1 = numberOfInventory1_;
    }

    public String getCityAdress1() {
        return cityAdress1;
    }

    public void setCityAdress1(String cityAdress1) {
        this.cityAdress1 = cityAdress1;
    }

    public String getSectionName11() {
        return sectionName11;
    }

    public void setSectionName11(String sectionName11) {
        this.sectionName11 = sectionName11;
    }

    public String getSectionName12() {
        return SectionName12;
    }

    public void setSectionName12(String SectionName12) {
        this.SectionName12 = SectionName12;
    }

    public int getNumberOfInventory1() {
        return numberOfInventory1;
    }

    public void setNumberOfInventory1(int numberOfInventory1) {
        this.numberOfInventory1 = numberOfInventory1;
    }
}