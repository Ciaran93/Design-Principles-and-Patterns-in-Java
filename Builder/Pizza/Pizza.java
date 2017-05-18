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
public class Pizza {
    
    private boolean cheese;
    private boolean chicken;
    private boolean pepperoni;
    private boolean mushrooms;

    
    public Pizza(){
        
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isChicken() {
        return chicken;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }
    
    public void PizzaToString(){
        
        System.out.println("Cheese: " + isCheese() + " Chicken: "+ isChicken() + " Pepperoni: " + isPepperoni());
    }
    
}
