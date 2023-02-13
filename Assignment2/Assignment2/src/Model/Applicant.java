/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author xyh10
 */
public class Applicant {
    static int count = 0;
    int ApplicationID;
    String firstName;
    String lastName;
    Pet pet;
    Date applicationDate;

    public Applicant() {
        this.ApplicationID = count ++;
    }

    @Override
    public String toString() {
        return  "ApplicationID: " + ApplicationID;
    }

    public Applicant(String firstName, String lastName, Date date) {
        this.ApplicationID = count ++;
        this.firstName = firstName;
        this.lastName = lastName;
        applicationDate = date;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public int getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(int ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public Pet createPet(){
        pet = new Pet();
        return pet;
    }
    
    public Pet createPet(String name, int age, boolean gender, String type, String breed){
        pet = new Pet(name, age, gender, type, breed);
        return pet;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    
    
    

    
    
}
