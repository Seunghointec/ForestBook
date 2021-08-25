package be.intecbrussel.the_notebook.App;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Bush;
import be.intecbrussel.the_notebook.plant_entities.Flower;
import be.intecbrussel.the_notebook.plant_entities.LeafType;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import be.intecbrussel.the_notebook.plant_entities.Scent;
import be.intecbrussel.the_notebook.plant_entities.Tree;
import be.intecbrussel.the_notebook.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;
import java.util.LinkedHashSet;
import java.util.Set;

public class ForestNoteBookApp {

    public static void main(String[] args) {
        ForestNoteBook classification = new ForestNoteBook();

        //Plants_tree
        Tree plant_tree = new Tree("pine tree", 53.0D);
        plant_tree.setLeafType(LeafType.NEEDLE);
        Tree plant_tree1 = new Tree("Oak tree", 62.0D);
        plant_tree1.setLeafType(LeafType.HAND);
        classification.addPlant(plant_tree);
        classification.addPlant(plant_tree1);

        //Plants_bush
        Bush plant_bush = new Bush("Sea Grape", 2.1D);
        plant_bush.setFruit("Grape");
        plant_bush.setLeafType(LeafType.ROUND);
        Bush plant_bush1 = new Bush("Blackberry", 5.57D);
        plant_bush1.setFruit("BlackBerry");
        plant_bush1.setLeafType(LeafType.SPEAR);
        Bush plant_bush2 = new Bush("Raspberry", 1.78D);
        plant_bush2.setFruit("Raspberry");
        plant_bush2.setLeafType(LeafType.HEART);
        classification.addPlant(plant_bush);
        classification.addPlant(plant_bush1);
        classification.addPlant(plant_bush2);

        //Plants_flower
        Flower plant_flower = new Flower("nasturtiums", 0.5D);
        plant_flower.setSmell(Scent.SWEET);
        Flower plant_flower1 = new Flower("Freesia", 0.57D);
        plant_flower1.setSmell(Scent.ORANGE);
        Flower plant_flower2 = new Flower("Pineappleweed", 0.12D);
        plant_flower2.setSmell(Scent.PINEAPPLE);
        classification.addPlant(plant_flower);
        classification.addPlant(plant_flower1);
        classification.addPlant(plant_flower2);
        Weed plant_weed = new Weed("Cannabis", 3.12D);

        //Plant_weed
        plant_weed.setArea(2.17D);
        classification.addPlant(plant_weed);

        //Animal_Carnivore
        Carnivore animal_carnivore = new Carnivore("Tiger", 87.0D, 1.5D, 2.5D);
        animal_carnivore.setMaxFoodSize(123.12D);
        Carnivore animal_carnivore1 = new Carnivore("African dog", 22.0D, 1.02D, 0.92D);
        animal_carnivore1.setMaxFoodSize(76.75D);
        Carnivore animal_carnivore2 = new Carnivore("Lion", 130.0D, 1.2D, 2.1D);
        animal_carnivore2.setMaxFoodSize(493.39D);
        classification.addAnimal(animal_carnivore);
        classification.addAnimal(animal_carnivore1);
        classification.addAnimal(animal_carnivore2);

        Set<Plant> plantDiet = new LinkedHashSet<>();
        plantDiet.add(plant_bush);
        plantDiet.add(plant_tree);
        plantDiet.add(plant_tree1);
        plantDiet.add(plant_bush1);
        plantDiet.add(plant_bush2);
        plantDiet.add(plant_weed);

        //Animal_herbivores
        Herbivore animal_herbivore = new Herbivore("Giraffe", 1200.0D, 2.6D, 2.5D);
        animal_herbivore.setPlantDiet(plantDiet);
        animal_herbivore.addPlantToDiet(plant_tree1);
        Herbivore animal_herbivore1 = new Herbivore("Elephant", 22.0D, 1.02D, 0.92D);
        animal_herbivore1.setPlantDiet(plantDiet);
        animal_herbivore1.addPlantToDiet(plant_bush1);
        Herbivore animal_herbivore2 = new Herbivore("Rabbit", 3.0D, 0.5D, 0.5D);
        animal_herbivore2.setPlantDiet(plantDiet);
        animal_herbivore2.addPlantToDiet(plant_bush);
        classification.addAnimal(animal_herbivore);
        classification.addAnimal(animal_herbivore1);
        classification.addAnimal(animal_herbivore2);

        //Animal_omnivores
        Omnivore animal_omnivore = new Omnivore("Human", 76.0D, 1.75D, 0.45D);
        animal_omnivore.setMaxFoodSize(1.5D);
        animal_omnivore.setPlantDiet(plantDiet);
        animal_omnivore.addPlantToDiet(plant_weed);
        Omnivore animal_omnivore1 = new Omnivore("Orangutan", 37.0D, 1.13D, 0.67D);
        animal_omnivore1.setMaxFoodSize(3.0D);
        animal_omnivore1.setPlantDiet(plantDiet);
        animal_omnivore1.addPlantToDiet(plant_bush2);
        Omnivore animal_omnivore2 = new Omnivore("Gorilla", 169.5D, 1.7D, 1.5D);
        animal_omnivore2.setMaxFoodSize(18.0D);
        animal_omnivore2.setPlantDiet(plantDiet);
        animal_omnivore2.addPlantToDiet(plant_bush1);
        classification.addAnimal(animal_omnivore);
        classification.addAnimal(animal_omnivore1);
        classification.addAnimal(animal_omnivore2);


        System.out.println("Here are the number of animals that I've encountered " + classification.getAnimalCount());
        System.out.println("Here are the number of plants that I've encountered " + classification.getPlantCount());
        classification.printNotebook();


        System.out.println("During my time in a forest, I have compiled the list of carnivores: " + classification.getCarnivores());
        System.out.println("During my time in a forest, I have compiled the list of omnivores:  " + classification.getOmnivores());
        System.out.println("During my time in a forest, I have compiled the list of herbivores: " + classification.getHerbivores());
        classification.sortedAnimalsByName();
        classification.sortedPlantsByName();

        System.out.println("\n-----------The list of species in a forest complied by Seungho-----------------");
        classification.printNotebook();
        System.out.println("-----------The list is sorted in an alphabetical order-----------------");

        System.out.println("\n###############################################################################");
        System.out.println("-----------The list of species in a forest complied by Seungho-----------------");
        classification.sortAnimalsByHeight();
        classification.sortPlantsByHeight();

        //We have created a method for printing the height.
        classification.printAnimals();
        classification.printPlants();
        System.out.println("-----------The list is sorted by a height-----------------");
    }
}
