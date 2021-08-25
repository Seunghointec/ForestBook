package be.intecbrussel.the_notebook.animal_entities;

import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.Set;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {
        plantDiet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore{" + this.getName() + " has "
                + "the weight of " + this.getWeight() + "kg"
                + ", height of " + this.getHeight() + "m"
                + " and the length of " + this.getLength() + "m."
                + " The planet diet of the species is" + this.getPlantDiet()+
                '}';
    }
}
