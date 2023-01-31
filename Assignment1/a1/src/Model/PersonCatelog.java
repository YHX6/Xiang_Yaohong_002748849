/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.ImageIcon;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author xyh10
 */
public class PersonCatelog {
    List<Person> catelog = new ArrayList<>();
    
    public void PersonCatelog(){
        
    }
    
    
    public List<Person> getCatelog(){
        return catelog;
    }
    
    public Person getOrCreate(String username){
        for(Person p:catelog){
            if(username.equals(p.getUserName())){
                return p;
            }
        }
        
        Person p = new Person();
        p.setUserName(username);
        catelog.add(p);
        return p;
    }
    
    public Person getPerson(String username){
        for(Person p:catelog){
            if(username.equals(p.getUserName())){
                return p;
            }
        }
        return null;
    }
    
    public Person createPerson(String username){
        Person p = new Person();
        p.setUserName(username);
        catelog.add(p);
        return p;
    }
    
    
    public void loadSamplePerson(int size){
        // create some samples 
        for(int i=0; i<size; i++){
            Person p = createPerson("sampleUserName" + i);
            p.setFirstName("John");
            p.setLastName("Smith");
            p.setEmailID("sampl" + i + "e@gmail.com");
            p.setPhone("123456789");
            
            Recipe recipe = new Recipe(p);
            recipe.setTitle("Cola");
            recipe.setNoOfServings(1500);
            recipe.setIsGlutenFree(true);
            recipe.setDifficultyLevel(2.5);
            recipe.setNoOfIngredient(i + 1);
            recipe.setCategory("drinks");
            recipe.setDescription("This is an test sample!");
            
            Image image = new ImageIcon("C:\\Users\\xyh10\\Pictures\\Saved Pictures\\food.jpg").getImage().getScaledInstance(200, 150,Image.SCALE_SMOOTH );
            ImageIcon   imageIcon = new ImageIcon(image) ;
            recipe.setImage(imageIcon);
           

            
            
        }
    }
    
}
