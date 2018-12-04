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
public class Stock implements Serializable{
    
     //data types
    protected String name;
    protected int quantity;
    protected double price;
    protected String id;
    //constructor-over
    public Stock(String name, int quantity, double price, String id){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        this.id=id;
    }
    //default-cons
    public Stock(){
        name="";
        quantity=0;
        price=0.0;
        id="";
        
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
    
    //It prints every thing when it will call in GUI with all info of super class.
    public String printDetails(){
        return "\n Item Name: "+name+"\n Quantity: "+quantity+"\n Price: "+price+"\n ID: "+id;
        
      
    }
}
