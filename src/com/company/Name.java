package com.company;

public class Name {
    private String firstName;
    private String lastName;

    public String getFirstName() { return firstName;}
    public void setFirstName(String newFirstName) {this.firstName = newFirstName;}

    public String getLastName() { return lastName;}
    public void setLastName(String newLastName) {this.lastName = newLastName;}

    Name(){
        firstName = "John";
        lastName = "Doe";
    }

    Name(String first, String second){
        firstName = first;
        lastName = second;
    }

}
