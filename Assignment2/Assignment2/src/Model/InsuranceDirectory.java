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
public class InsuranceDirectory {
    List<Insurance> insuranceCatalog;

    public InsuranceDirectory() {
        insuranceCatalog = new ArrayList<>();
    }

    public List<Insurance> getInsuranceCatalog() {
        return insuranceCatalog;
    }

    public void setInsuranceCatalog(List<Insurance> insuranceCatalog) {
        this.insuranceCatalog = insuranceCatalog;
    }
    
    public Insurance createInsurance(){
        Insurance ins = new Insurance();
        insuranceCatalog.add(ins);
        return ins;
    }    
    
    public Insurance createInsurance(int planID, String planName, double costPerMonth){
        Insurance ins = new Insurance(planID, planName, costPerMonth);
        insuranceCatalog.add(ins);
        return ins;
    } 
    
}
