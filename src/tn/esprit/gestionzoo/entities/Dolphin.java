package tn.esprit.gestionzoo.entities;

public class Dolphin  extends Aquatic{
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
            return swimmingSpeed;
    }
    public  void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(String family , String name , int age , boolean isMammal , String habitat , float swimmingSpeed) {
        super(family, name , age , isMammal ,habitat);
        this.swimmingSpeed = swimmingSpeed;

    }
    @Override
    public String toString(){
        return  "Aquatic " + getName() + " " + getAge() + " " + getFamily() + " " + isMammal() + " habitat: " + getHabitat()+ " " + getSwimmingSpeed();
    }
    public void swim (){
        System.out.println("This dolphin is swimming.  ");
    }
}
