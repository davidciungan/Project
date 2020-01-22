package animalrescue;

import org.w3c.dom.ls.LSOutput;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();

        rex.setName("Danut");
        System.out.println(rex.getName());
        rex.setRace("bichon");
        System.out.println(rex.getRace());
        rex.setAge(3.5f);
        System.out.println(rex.getAge());
        rex.setColor("blue");
        System.out.println(rex.getColor());
        rex.setSize(25);
        System.out.println(rex.getSize());
        rex.setFriendly(true);
        System.out.println(rex.getFriendly());

        Dog brunno = new Dog();


        //tema

        Animal cow = new Animal();

        cow.setName("Gina");
        System.out.println(cow.getName());
        cow.setHealt(8);
        System.out.println(cow.getHealthlevel());
        cow.setHunger(9);
        System.out.println(cow.getHungerlevel());
        cow.setStateofmind(9);
        System.out.println(cow.getStateofmind());



Rescuer adopter = new Rescuer();

 adopter.setName("Rebeka");
        System.out.println(adopter.getName());
 adopter.setMoney(20);
        System.out.println(adopter.getMoney());


        Vet medic = new Vet();

  medic.setName("Gigel");
        System.out.println(medic.getName());
  medic.setSpeciality("Padurar");
        System.out.println(medic.getSpeciality());

    }




}
