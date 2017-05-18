/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder1;


public interface CoffeeBuilder {
    
    CoffeeBuilder setMilk(String type);
    CoffeeBuilder setName(String name);
    
    Coffee make();

}
