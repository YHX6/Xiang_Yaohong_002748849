/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.*;

/**
 *
 * @author xyh10
 */
public class Recipe {
    private Person chef;
    private String title;
    private long noOfServings;
    private boolean isGlutenFree;
    private double difficultyLevel;
    private int noOfIngredient;
    private String category;
    private String description;
    private ImageIcon image;

    /**
     * @return the title
     */
    
    public Recipe(Person chef){
        this.chef = chef;
    }
    
    public Recipe(String title, long noOfServings, boolean isGlutenFree, double difficultyLevel, int noOfIngredient, String category, String description) {
        this.title = title;
        this.noOfServings = noOfServings;
        this.isGlutenFree = isGlutenFree;
        this.difficultyLevel = difficultyLevel;
        this.noOfIngredient = noOfIngredient;
        this.category = category;
        this.description = description;
    }
    
    
    public Person getPerson(){
        return chef;
    }
    
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the noOfServings
     */
    public long getNoOfServings() {
        return noOfServings;
    }

    /**
     * @param noOfServings the noOfServings to set
     */
    public void setNoOfServings(long noOfServings) {
        this.noOfServings = noOfServings;
    }

    /**
     * @return the isGlutenFree
     */
    public boolean isIsGlutenFree() {
        return isGlutenFree;
    }

    /**
     * @param isGlutenFree the isGlutenFree to set
     */
    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    /**
     * @return the difficultyLevel
     */
    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    /**
     * @param difficultyLevel the difficultyLevel to set
     */
    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    /**
     * @return the noOfIngredient
     */
    public int getNoOfIngredient() {
        return noOfIngredient;
    }

    /**
     * @param noOfIngredient the noOfIngredient to set
     */
    public void setNoOfIngredient(int noOfIngredient) {
        this.noOfIngredient = noOfIngredient;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the image
     */
    public ImageIcon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public static boolean validateRecipeTitle(String str){
        //contains only letters and digits
        return str.matches("[A-Za-z0-9]*");
    }
    
    
    public static boolean validateNoOfServings(String str){
        //contains only digits
        return str.matches("[0-9]*");
    }
    
    public static boolean validateCategoryOfFood(String str){
        //contains only letters
        return str.matches("[A-Za-z]*");
    }  
    
    public static int validateDifficultyLevel(String str){
        //contains only letters and digits, in the range [1,5]
        if(!str.matches("([0-9]+)(\\.([0-9]+))?")){
            return 1;
        }else if(Double.parseDouble(str) >5 || Double.parseDouble(str) < 1){
            return 2;
        }
        return 0;
    }   
}
