public class GymNetwork {
    public String country;
    public int numberOfGyms;
    public String gymName1;
    public String gymName2;
    public int monthIncome;

    public GymNetwork(String country_, int numberOfGyms_, String gymName1_, String gymName2_, int monthIncome_) {
     country=country_;
     numberOfGyms=numberOfGyms_;
     gymName1=gymName1_;
     gymName2=gymName2_;
     monthIncome=monthIncome_;
    }
    public GymNetwork(String gymName1_, String gymName2_, String country_) {
        gymName1=gymName1_;
        gymName2=gymName2_;
        country=country_;
    }

//    public GymNetwork(String gymName2_) {
//        gymName2=gymName2_;
//    }

    public void showInfo() {
        System.out.println(country);
        System.out.println(numberOfGyms);
        System.out.println(monthIncome);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfGyms() {
        return numberOfGyms;
    }

    public void setNumberOfGyms(int numberOfGyms) {
        this.numberOfGyms = numberOfGyms;
    }

    public int getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(int monthIncome) {
        this.monthIncome = monthIncome;
    }

    public String getGymName1() {
        return gymName1;
    }

    public void setGymName1(String gymName1) {
        this.gymName1 = gymName1;
    }

    public String getGymName2() {
        return gymName2;
    }

    public void setGymName2(String gymName2) {
        this.gymName2 = gymName2;
    }


}
