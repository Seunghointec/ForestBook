package be.intecbrussel.the_notebook.plant_entities;

public class Bush extends Plant{
    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leaftype) {
        this.leafType = leaftype;
    }

    @Override
    public String toString() {
        return "Bush{" + this.getName() + " has "
                + "a height of " + this.getHeight() + "m. "
                + "The species has a fruit called ='" + this.getFruit() + '\'' +
                ", and their leafType shape is ='" + this.getLeafType()+ '\'' +
                '}';
    }
}