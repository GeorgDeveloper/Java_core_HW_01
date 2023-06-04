package ru.gdeveloper.testprogram;

public class Animals {
    private String name;
    private String dreed;
    private int age;

    public Animals(String name, String dreed, int age) {
        this.name = name;
        this.dreed = dreed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDreed() {
        return dreed;
    }

    public void setDreed(String dreed) {
        this.dreed = dreed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", dreed='" + dreed + '\'' +
                ", age=" + age +
                '}';
    }
}
