/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeapp;

import java.io.Serializable;

/**
 *
 * @author x17112044
 */
public class Retail extends Sale implements Serializable {
    //Declaring variables
    private String comment;

    //setting it to default value
        //Constructor
    public Retail() {
        comment="";
    }

    //Over loaded constructor
    public Retail(String name, String id, double price, int quantity,double total, String comment) {
        super(name, id, price, quantity,total);
        this.comment=comment;
    }
    
    //Setters

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    //Getters

    public String getComment() {
        return comment;
    }
    
    //It prints every thing when it will call in GUI.
    @Override
     public String printDetails(){
    
        return "Retail Sale \n \n "+ super.printDetails()+ "\n Comment: "+comment;
    }
    
}
