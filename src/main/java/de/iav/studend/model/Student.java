package de.iav.studend.model;

import java.util.Objects;

public class Studend {
    private String name;
    private int id;

    private int age;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Studend(String name, int id, int age) {
        this.name = name;
        this.id = id;
    }

    public Studend(String name) {
        this.name = name;
    }

    public Studend(int id) {
        this.id = id;
    }

    public Studend() {}

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id + '\'' +
                ", age=" +age +'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studend studend = (Studend) o;
        return id == studend.id && Objects.equals(name, studend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
