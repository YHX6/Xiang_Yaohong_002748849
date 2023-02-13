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
public class ApplicantsDirectory {
    List<Applicant> applicantCatalog;
    
    public ApplicantsDirectory(){
        applicantCatalog = new ArrayList<>();
    }
    
        
    public Applicant createApplicant(String firstName, String lastName, Date date){
        Applicant app = new Applicant(firstName, lastName, date);
        applicantCatalog.add(app);
        return app;
    }
    
        
    public Applicant createApplicant(){
        Applicant app = new Applicant();
        applicantCatalog.add(app);
        return app;
    }
    
    
    public List<Applicant> searchApplicant(int id){
        List<Applicant> ans = new ArrayList<>();
        
        for(Applicant app:applicantCatalog){
            if(app.getApplicationID() == id){
                ans.add(app);
            }
        }
        
        return ans;
    }
    
       
    public List<Applicant> searchApplicant(String name){
        List<Applicant> ans = new ArrayList<>();
        
        for(Applicant app:applicantCatalog){
            if(app.getName().equals(name)){
                ans.add(app);
            }
        }
        
        return ans;
    }

    public List<Applicant> getApplicantCatalog() {
        return applicantCatalog;
    }

    public void setApplicantCatalog(List<Applicant> applicantCatalog) {
        this.applicantCatalog = applicantCatalog;
    }
        
    public List<Applicant> searchApplicant(int id, String name){
        List<Applicant> ans = new ArrayList<>();
        
        for(Applicant app:applicantCatalog){
            if(app.getName().equals(name) && app.getApplicationID() == id){
                ans.add(app);
            }
        }
        
        return ans;
    }
}
