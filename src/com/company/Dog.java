package com.company;

public class Dog {
    private String name;

    Dog(){

    }
    //Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    private String breed;
    //Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    private String gender;
    //Getter
    public String getGender() {
        return gender;
    }

    // Setter
    public void setGender(String newGender) {
        this.gender = newGender;
    }

    private int age;
    //Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int newAge) {
        this.age = newAge;
    }

    private double weight;
    //Getter
    public double getWeight() {
        return weight;
    }

    // Setter
    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    private boolean fleas;
    //Getter
    public boolean getFleas() {
        return fleas;
    }

    // Setter
    public void setFleas(boolean newFleas) {
        this.fleas = newFleas;
    }

    Dog(String dogName, int dogAge, String dogBreed, String dogGender, double dogWeight){
        name = dogName;
        age = dogAge;
        breed = dogBreed;
        fleas = false;
        gender = dogGender;
        weight = dogWeight;
    }

    Dog(String dogName, int dogAge, String dogBreed, boolean dogFleas, String dogGender, double dogWeight){
        name = dogName;
        age = dogAge;
        breed = dogBreed;
        fleas = dogFleas;
        gender = dogGender;
        weight = dogWeight;
    }



    public String eat()  { return " Chomp Chomp Chomp " ;}
    public String bark() { return " Woof Woof Woof "; }
    public String scratch() {return " Scritch Scritch Scritch "; }
}
