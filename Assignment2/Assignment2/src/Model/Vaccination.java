/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xyh10
 */
public class Vaccination {
    String name;
    boolean courseCompleted;

    public Vaccination(String name, boolean courseCompleted) {
        this.name = name;
        this.courseCompleted = courseCompleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(boolean courseCompleted) {
        this.courseCompleted = courseCompleted;
    }

    public Vaccination() {
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
    
}
