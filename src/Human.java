public class Human
{
    private String name; //all ATTRIBUTES should be PRIVATE
    private String surname;
    private int age;

    void MakeMeOlder()   //method
    {
        age++;
    }

    public Human(String name_, String surname_, int age_) {
        name = name_;
        surname = surname_;
        age = age_;
    }

    // GETTER AND SETTER TO REFER TO PRIVATE ATTRIBUTE IN MAIN OUT OF THIS CLASS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
