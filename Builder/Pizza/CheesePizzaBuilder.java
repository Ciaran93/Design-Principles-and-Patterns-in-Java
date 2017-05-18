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
public class CheesePizzaBuilder extends PizzaBuilder{

    @Override
    void addCheese() {
        pizza.setCheese(true);
    }

    @Override
    void addChicken() {
        pizza.setChicken(false);
    }

    @Override
    void addPepperoni() {
        pizza.setPepperoni(false);
    }

    @Override
    void addMushrooms() {
        pizza.setMushrooms(false);
    }
    
}
