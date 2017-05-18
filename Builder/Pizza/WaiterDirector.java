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
public class WaiterDirector {
    
    // private pizza builder
    private PizzaBuilder pb;
    
    // passed pizza builder
    public WaiterDirector(PizzaBuilder builder){
        this.pb = builder;
    }
    
    // calls the make method which returns the pizza
    public Pizza getPizza(){
        return pb.make();
    }
    
    // make all the ingredients
    // the builder decides the toppings
    public void makePizza(){
        pb.createNewPizzaProduct();
        pb.addCheese();
        pb.addChicken();
        pb.addMushrooms();
        pb.addPepperoni();
    }
    
    
}
