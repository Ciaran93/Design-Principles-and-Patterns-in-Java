/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder1;

/**
 *
 * @author 40111067
 */
public class Coffee {
    
    private String milkType;
    private String name;
    
    public Coffee(){
        
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void coffeeToString(){
        System.out.println(this.name + " with " + this.milkType);
    }
    

    
    
}
