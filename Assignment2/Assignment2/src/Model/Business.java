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
public class Business {
    ApplicantsDirectory applicantsDirectory;
    InsuranceDirectory insuranceDirectory;
    
    public Business(){
        
        applicantsDirectory = new ApplicantsDirectory();
        
        insuranceDirectory = new InsuranceDirectory();
      
    }

    public ApplicantsDirectory getApplicantsDirectory() {
        return applicantsDirectory;
    }

    public void setApplicantsDirectory(ApplicantsDirectory applicantsDirectory) {
        this.applicantsDirectory = applicantsDirectory;
    }

    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory insuranceDirectory) {
        this.insuranceDirectory = insuranceDirectory;
    }
    
    
    
    
}
