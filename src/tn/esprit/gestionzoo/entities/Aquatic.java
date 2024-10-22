package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
public void  setHabitat(String habitat) {
         this.habitat = habitat;
}
@Override
public String toString(){
        return "Aquatic " + getName() + " " + getAge() + " " + getFamily() + " " + isMammal() + " habitat: " + getHabitat();
}
    public abstract void swim ();

public boolean equals(Object obj) {
    if (obj instanceof Aquatic aquaticAnimal) {
        return this.getName().equals(aquaticAnimal.getName()) &&
                this.getAge() == aquaticAnimal.getAge() &&
                this.habitat.equals(aquaticAnimal.habitat);
    }
    return false;}
}

