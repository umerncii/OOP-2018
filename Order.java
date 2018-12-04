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
public class Order implements Serializable{
    
    //variables
        protected int quantity;
        protected String name;
        protected String cName;
        protected double cost;
        protected String id;
        
        //overloaded constructor 
        public Order(int quantity, String name, double cost, String id,String cName) {
            this.quantity = quantity;
            this.name = name;
            this.cName = cName;
            this.cost = cost;
            this.id = id;
        }
        
        //constructor 
        public Order(){
            quantity = 0;
            name = "";
            cName="";
            cost = 0.0;
            id = "";
        }
        
        //setters and getters
        
        public String getId() {
            return id;
        }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

        public void setId(String id) {
             this.id = id;
        }
        
        public int getQuantity() {
         return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
        
        //It prints every thing when it will call in GUI.
        //print details
        public String printDetails(){
            return "Company Name: "+cName+"\n Item Name: " +name+"\n Quantity: " +quantity+"\n Cost Price: " +cost;
        }
}
