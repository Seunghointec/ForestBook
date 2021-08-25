package be.intecbrussel.the_notebook.plant_entities;

public abstract class Plant {
    private final String NAME;
    private double height;

    public Plant(String name) {
        this.NAME = name;
    }

    public Plant(String name, double height) {
        this.NAME = name;
        setHeight(height);
    }

    public String getName() {
        return NAME;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
