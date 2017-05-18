/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder2;

/**
 *
 * @author 40111067
 */
public abstract class PizzaBuilder {
    
    public Pizza pizza;
    
    abstract void addCheese();
    abstract void addChicken();
    abstract void addPepperoni();
    abstract void addMushrooms();
    
    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
    
    Pizza make(){
        return pizza;
    }
}
