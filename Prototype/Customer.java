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
public class Customer {
    
    public static void main(String[] args) {
        
        // Instanciate vechicle manager
        VehicleManager vm = new VehicleManager();
        
        // Get Saloon and Truck
        // Customer has no idea if it is new object or clone
        Vehicle car = vm.getSaloon();
        Vehicle truck = vm.getTruck();
        
        System.out.println(car.getMake() + " has engine size:" + car.getEngineSize());
        System.out.println(truck.getMake() + " has engine size:" + truck.getEngineSize());

    }
    
}
