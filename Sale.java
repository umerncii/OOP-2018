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
public class Sale implements Serializable{
    //Declaring variables
    protected String name;
    protected String id;
    protected double price;
    protected double total;
    protected int quantity;

    public Sale(){
    
        //setting it to default value
        //Constructor
        name="";
        id="";
        price=0.0;
        total=0.0;
        quantity=0;
    
    }
    
    //Over loaded constructor
    public Sale(String name, String id, double price, int quantity,double total) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.total=total;
    }
    
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    //Getters
    
    public String getName(){
    
        return name;
    } 

    public double getTotal() {
        return total;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
    //It prints every thing when it will call in GUI.
    public String printDetails(){
    
        return "Name: "+name+"\n ID: "+ id +"\n Price: "+price+"\n Quantity: "+quantity+"\n Total Bill: "+total;
    }
    
}
