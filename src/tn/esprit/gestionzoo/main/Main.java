package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("zoo","ariana");
        Dolphin d1 = new Dolphin("7out","dalphoun",20 , true , "b7ar",2.0f);


        Penguin p1 = new Penguin("batre9","batrou9", 23 ,  true, "thelj", 0.1f);
        System.out.println(d1);
        System.out.println(p1);

zoo.addAquaticAnimal(d1);
zoo.addAquaticAnimal(p1);

        p1.swim();
        d1.swim();

    }
}

