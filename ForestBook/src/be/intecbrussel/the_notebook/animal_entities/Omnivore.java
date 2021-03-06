package be.intecbrussel.the_notebook.animal_entities;

import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal{
    private Set<Plant> plantDiet;
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore{" + this.getName() + " has "
                + "the weight of " + this.getWeight() + "kg"
                + ", height of " + this.getHeight() + "m"
                + " and the length of " + this.getLength() + "m." +
                " The maxFoodSize of the species is = " + this.getMaxFoodSize() + "kg." +
                "The planet diet of the species is" + this.getPlantDiet()+
                '}';
    }
}
