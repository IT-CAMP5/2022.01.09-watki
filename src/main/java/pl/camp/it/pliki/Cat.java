package pl.camp.it.pliki;

public class Cat {
    private String name;
    private String race;
    private int age;

    public Cat(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name+";"+race+";"+age;
    }
}
