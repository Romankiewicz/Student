package de.iav.model;

public class Simpson {
    private int age;
    public String name;
    public String gender;
    private String hairColor;


    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

 //   public String toString () {
 //       return " /Name: " + name + " /Alter: " + age + " /Geschlecht: " + gender + " /Haarfarbe: " + hairColor;
 //
 //   }

    @Override
    public String toString() {
        return "Simpson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    public Simpson(int age, String name, String gender, String hairColor) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.hairColor = hairColor;
    }
    public Simpson() {}
}
