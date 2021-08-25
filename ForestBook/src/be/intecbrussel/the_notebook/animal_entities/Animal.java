package be.intecbrussel.the_notebook.animal_entities;

import java.util.Objects;

public abstract class Animal {

    private final String NAME;
    private double weight;
    private double height;
    private double length;

    public Animal(String name) {
        this.NAME = name;
    }

    public Animal(String name, double weight, double height, double length) {
        this.NAME = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return NAME;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0 && Double.compare(animal.height, height) == 0 && Double.compare(animal.length, length) == 0 && Objects.equals(NAME, animal.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, weight, height, length);
    }
}
