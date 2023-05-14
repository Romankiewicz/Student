package de.iav.studend.model.animals;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                '}';
    }
}