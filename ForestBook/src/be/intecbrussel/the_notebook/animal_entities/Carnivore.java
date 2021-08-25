package be.intecbrussel.the_notebook.animal_entities;


public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" + this.getName() + " has "
                + "the weight of " + this.getWeight() + "kg"
                + ", height of " + this.getHeight() + "m"
                + " and the length of " + this.getLength() + "m." +
                " The maxFoodSize of the species is = " + this.getMaxFoodSize() + "kg" +
                '}';
    }
}
