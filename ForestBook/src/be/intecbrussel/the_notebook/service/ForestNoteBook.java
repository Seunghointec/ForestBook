package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.*;
import java.util.stream.Collectors;

public class ForestNoteBook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNoteBook() {
       carnivores = new ArrayList<>();
       omnivores = new ArrayList<>();
       herbivores = new ArrayList<>();
       animals = new ArrayList<>();
       plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal){
        animalCount++;
        animals.add(animal);
        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        } else if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
        } else if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        }
    }

    public void addPlant(Plant plant){
        plantCount++;
        plants.add(plant);
    }

    public void printNotebook() {
        System.out.println("My First Forest NoteBook Application\n");
        System.out.println("Types of Animal: We Spotted in forest\n");
        System.out.println("--------------Carnivore animals---------------");
        carnivores.forEach(System.out::println);
        System.out.println("--------------Herbivore animals---------------");
        herbivores.forEach(System.out::println);
        System.out.println("--------------Omnivore animals---------------");
        omnivores.forEach(System.out::println);
        System.out.println("\nTypes of Plant: We Spotted in forest\n");
        plants.forEach(System.out::println);
        System.out.println("A detail classification of forest species complied by Seungho Kang\n");
    }

    public void sortedAnimalsByName() {
        animals = animals.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        carnivores = carnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        herbivores = herbivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
        omnivores = omnivores.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());
    }

    public void sortedPlantsByName() {
        plants = plants.stream().sorted(Comparator.comparing(Plant::getName)).collect(Collectors.toList());
    }

    public void sortAnimalsByHeight(){
        animals = animals.stream().sorted(Comparator.comparing(Animal::getHeight)).collect(Collectors.toList());
    }

    public void sortPlantsByHeight(){
        plants = plants.stream().sorted(Comparator.comparing(Plant::getHeight)).collect(Collectors.toList());
    }


    public void printAnimals(){
        System.out.println("Animals sorted by their height:\n");
        animals.forEach(System.out::println);
    }

    public void printPlants(){
        System.out.println("\nPlants sorted by their height: ");
        plants.forEach(System.out::println);
    }
}


