package POJOS;
// Generated Jan 5, 2018 12:55:52 PM by Hibernate Tools 3.6.0



/**
 * AddOn generated by hbm2java
 */
public class AddOn  implements java.io.Serializable {


     private int idAddOn;
     private String addOnName;
     private double addOnPrice;

    public AddOn() {
    }

    public AddOn(int idAddOn, String addOnName, double addOnPrice) {
       this.idAddOn = idAddOn;
       this.addOnName = addOnName;
       this.addOnPrice = addOnPrice;
    }
   
    public int getIdAddOn() {
        return this.idAddOn;
    }
    
    public void setIdAddOn(int idAddOn) {
        this.idAddOn = idAddOn;
    }
    public String getAddOnName() {
        return this.addOnName;
    }
    
    public void setAddOnName(String addOnName) {
        this.addOnName = addOnName;
    }
    public double getAddOnPrice() {
        return this.addOnPrice;
    }
    
    public void setAddOnPrice(double addOnPrice) {
        this.addOnPrice = addOnPrice;
    }




}

