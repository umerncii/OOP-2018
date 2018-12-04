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
public class StaffS extends Sale implements Serializable {
    //Declaring variables
    private double dis;

    //setting it to default value
        //Constructor
    public StaffS() {
        dis =0.0;
    }

    //Over loaded constructor
    public StaffS(double dis, String name, String id, double price, int quantity,double total) {
        super(name, id, price, quantity,total);
        this.dis = dis;
    }
    
    //Setters

    public void setDis(double dis) {
        this.dis = dis;
    }
    
    //Getters

    public double getDis() {
        return dis;
    }
    
    @Override
     public String printDetails(){
    
        return "Staff Sale \n \n "+ "\n Discountend % : "+dis+"\n"+ super.printDetails();
    }
    
}
