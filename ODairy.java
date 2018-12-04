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
public class ODairy extends Order implements Serializable{
     //variables
    private int temperature;
    
    //overloaded constructor
    public ODairy(int temperature, String weight, String name, int quantity, double cost_price, String id,String cName) {
        super(quantity, name, cost_price, id,cName);
        this.temperature = temperature;
      
    }
    
    //constructor
    public ODairy(){
        temperature = 0;
    
    }

        //setters and getters
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

  
   
    
    //It prints every thing when it will call in GUI.
    //print details
    @Override
    public String printDetails(){
        return super.printDetails()+"\n Temperature: "+temperature;
    }
}
