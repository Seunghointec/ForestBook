package be.intecbrussel.the_notebook.plant_entities;

public class Flower extends Plant{
    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" + this.getName() + " has "
                + "a height of " + this.getHeight() + "m. "
                + "The species has a scent of='" + this.getSmell() + '\'' +
                '}';
    }
}

