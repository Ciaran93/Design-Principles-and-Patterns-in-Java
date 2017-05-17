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
public class Client {
    
    public static void main(String[] args) {
        
        /*
        * Clients use the factory to get the gearbox they need
        * No need for descision logic
        */
        
        // Create auto gearbox 
        Gearbox auto = GearboxFactory.create(GearboxFactory.Type.AUTO);        
        
        //Create Manual gearbox
        Gearbox manual = GearboxFactory.create(GearboxFactory.Type.MANUAL);

        
    }
    
}
