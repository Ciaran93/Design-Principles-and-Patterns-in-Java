/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author 40111067
 */
public class VehicleManager {
    
    private Vehicle saloon, truck;
            
    public VehicleManager(){
        saloon = new Saloon();
        truck = new Truck();
    }
    
    
    public Vehicle getSaloon(){
        return (Vehicle)saloon.clone();
    }
    
    public Vehicle getTruck(){
        return (Vehicle)truck.clone();
    }
}
