package animalrescue;

public class Vet {
    private String name;
    private String speciality;


    public void setName(String text) {
name=text;
    }

    public String getName(){
        return name;
    }



public void setSpeciality(String text){
        this.speciality= text;
}
    public String getSpeciality(){
        return this.speciality;
    }
}