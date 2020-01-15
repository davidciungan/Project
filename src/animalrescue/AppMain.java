package animalrescue;

import org.w3c.dom.ls.LSOutput;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();

        System.out.println(rex.age);
        rex.age = 3.2f;
        System.out.println(rex.age);
        System.out.println(rex.name);
Dog brunno = new Dog();
        System.out.println(brunno.name);

        //tema

        Animal cow= new Animal();

        System.out.println(cow.Name="maria");
        System.out.println(cow.HealthLevel=10);

Adopter human = new Adopter();
        System.out.println(human.Name="Ana");
        System.out.println(human.money=14);

        Vet medic = new Vet();
        System.out.println(medic.Name="Gigel");
        System.out.println(medic.Speciality="ce vrea el");
    }




}
