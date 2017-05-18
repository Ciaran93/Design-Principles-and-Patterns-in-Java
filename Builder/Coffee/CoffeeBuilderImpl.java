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
public class CoffeeBuilderImpl implements CoffeeBuilder {
    
    private Coffee coffee;
    
    public CoffeeBuilderImpl(){
        coffee = new Coffee();
    }

    @Override
    public CoffeeBuilder setMilk(String type) {
        coffee.setMilkType(type);
        return this;
    }

    @Override
    public CoffeeBuilder setName(String name) {
        coffee.setName(name);
        return this;
    }

    @Override
    public Coffee make() {
        return coffee;
    }
    
}
