/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeapp;
import java.io.Serializable;
/**
 *
 * @author x17111854
 */
public class Packaging extends Order implements Serializable {
    //Declaring variables
     private String materials;
    
    //overloaded constructor
    public Packaging( String materials,String name, int quantity, double cost_price, String id,String cName) {
        super(quantity, name, cost_price, id,cName);
        this.materials = materials;
    }
    
    //constructor
    public Packaging(){
        materials = "";
    }
    
    //setters and getters
    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }
    //It prints every thing when it will call in GUI.
    @Override
     public String printDetails(){
        return super.printDetails()+"\n Material: "+materials;
    }
}
