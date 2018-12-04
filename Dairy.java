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
public class Dairy extends Stock implements Serializable {
    //data types
    private String date;
    private int temperature;
    //overloaded-cons
    public Dairy(String name, int quantity, double price, String sId, String date, int temperature){
        super (name,quantity,price,sId);
        this.date=date;
        this.temperature=temperature;
        
    }
    //default constructor
    public Dairy(){
        date="";
        temperature=0;
    }
    //setter

    public void setDate(String date) {
        this.date = date;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

   //getters

    public String getDate() {
        return date;
    }

    public int getTemperature() {
        return temperature;
    }
    
    //It prints every thing when it will call in GUI.
    @Override
    public String printDetails(){
        return "Dairy Details \n "+super.printDetails()+"\n Receive Date: "+date+"\n Temperature: "+temperature;
    }
}
