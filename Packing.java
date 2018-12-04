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
public class Packing extends Stock implements Serializable{
     //data types 
   
    private String material;
    //overloaded-constructor
    public Packing(String name, int quantity, double price, String sId,String material){
        super (name,quantity,price,sId);
        this.material=material;
        
    }
    //default-constructor
    public Packing(){
        material="";
        
    }
    //setters

    public void setMaterial(String material) {
        this.material = material;
    }

   //Gettesr

    public String getMaterial() {
        return material;
    }
    
    //It prints every thing when it will call in GUI.
    @Override
    public String printDetails(){
        return "Packing Details \n "+super.printDetails()+"\n Material: "+material;
    }
}
