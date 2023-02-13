/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author xyh10
 */
public class Insurance {
    int planID;
    String planName;
    double costPerMonth;
    double costPerAnnum;

    public Insurance(int planID, String planName, double costPerMonth) {
        this.planID = planID;
        this.planName = planName;
        this.costPerMonth = costPerMonth;
        costPerAnnum = 12*costPerMonth;
    }

    public Insurance() {
    }

    public int getPlanID() {
        return planID;
    }

    public void setPlanID(int planID) {
        this.planID = planID;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(double costPerMonth) {
        this.costPerMonth = costPerMonth;
        calculateCostPerAnnum();
    }

    public double getCostPerAnnum() {
        return costPerAnnum;
    }

    public void setCostPerAnnum(double costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }

    @Override
    public String toString() {
        return "planID=" + planID + ",       planName=" + planName;
    }
    
    public double calculateCostPerAnnum(){
        costPerAnnum = 12*costPerMonth;
        return costPerAnnum;
    }
    
    
}
