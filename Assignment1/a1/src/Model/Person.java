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
public class Person {
    private String firstName = "unkown";
    private String lastName = "unkown";
    private String userName;
    private List<Recipe> recipes = new ArrayList<>();
    private String emailID;
    private String phone;

    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, String userName, String emailID, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.emailID = emailID;
        this.phone = phone;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the emailID
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * @param emailID the emailID to set
     */
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", emailID=" + emailID + ", phone=" + phone + '}';
    }
    
    public List<Recipe> getRecipes(){
      return recipes;
    }
    
    public Recipe findRecipe(String recipetitle){
        for(Recipe recipe:recipes){
            if(recipe.getTitle().equals(recipetitle)){
                return recipe;
            }
        }
        return null;
    }
    
    public boolean matchName(String name){
        String personName = firstName + " " + lastName;
        
        return personName.equals(name);
    }
    
    public static boolean validateFirstName(String str){
        //if contains unvalid character
        return str.matches("[A-Za-z]*");
    }
    
    public static boolean validateLastName(String str){
        //if contains unvalid character
        return str.matches("[A-Za-z]*");
    }
    
    public static boolean validateUserName(String str){
        //if contains only letters, digit, _, $
        return str.matches("[A-Za-z0-9_$]*");
    }
    
    public static boolean validateEmailID(String str){
        // xxx@xxx.com
        return str.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    }
    
    public static boolean validatePhone(String str){
        //9 digit phone number
        return str.matches("[0-9]*") && str.length() == 10;
    }

}
