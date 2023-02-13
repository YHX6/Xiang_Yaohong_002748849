/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;
/**
 *
 * @author xyh10
 */
public class Pet {
    String name;
    int age;
    boolean gender;
    String type;
    String breed;
    
    List<Vaccination> vaccinationHistory;
    Insurance insurancePlan;

    public Pet() {
        vaccinationHistory = new ArrayList<>();
    }

    public Pet(String name, int age, boolean gender, String type, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.breed = breed;
        vaccinationHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<Vaccination> getVaccinationHistory() {
        return vaccinationHistory;
    }

    public void setVaccinationHistory(List<Vaccination> vaccinationHistory) {
        this.vaccinationHistory = vaccinationHistory;
    }
    
    public Vaccination createVaccination(){
        Vaccination vac = new Vaccination();
        vaccinationHistory.add(vac);
        return vac;
    }
    
    public Vaccination createVaccination(String name, boolean courseCompleted){
        Vaccination vac = new Vaccination(name, courseCompleted);
        vaccinationHistory.add(vac);
        return vac;
    }

    public Insurance getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(Insurance insurancePlan) {
        this.insurancePlan = insurancePlan;
    }
    
    
    
    
    
}
