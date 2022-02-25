package com.company;

public class SuperHero {
    private Name name;
    private Date birthday;
    private boolean suit;
    private boolean cape;
    private boolean powers;

    public Name getName() { return name;}
    public void setMonth(Name newName) {this.name = newName;}

    public Date getBirthday() { return birthday;}
    public void setBirthday(Date newBirthday) {this.birthday = newBirthday;}

    public boolean getSuit() { return suit;}
    public void setSuit(boolean newSuit) {this.suit = newSuit;}

    public boolean getCape() { return cape;}
    public void setCape(boolean newCape) {this.cape = newCape;}

    public boolean getPowers() { return powers;}
    public void setPowers(boolean newPowers) {this.powers = newPowers;}

    SuperHero(String first, String last, boolean superheroSuit, boolean superheroCape){
        name = new Name(first, last);
        birthday = new Date();
        suit = superheroSuit;
        cape = superheroCape;
        powers = false;
    }

    SuperHero(String first, String last, int month, int day, int year, boolean superheroSuit, boolean superheroCape){
        name = new Name(first, last);
        birthday = new Date(month, day, year);
        suit = superheroSuit;
        cape = superheroCape;
        powers = false;
    }

    SuperHero(String first, String last, int month, int day, int year, boolean superheroSuit, boolean superheroCape, boolean superheroPowers){
        name = new Name(first, last);
        birthday = new Date(month, day, year);
        suit = superheroSuit;
        cape = superheroCape;
        powers = superheroPowers;
    }

    SuperHero(String first, String last, boolean superheroSuit, boolean superheroCape, boolean superheroPowers){
        name = new Name(first, last);
        birthday = new Date();
        suit = superheroSuit;
        cape = superheroCape;
        powers = superheroPowers;
    }
}
