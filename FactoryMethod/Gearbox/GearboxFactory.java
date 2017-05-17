/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author 40111067
 */
public abstract class GearboxFactory {
    
    //Gearbox types
    public enum Type {AUTO, MANUAL};
    
    // Static Factory Method
    public static Gearbox create(Type type){
        
        if(type == Type.AUTO){
            return new AutoGearbox();
        } else {
            return new ManualGearbox();
        }
    }
}
