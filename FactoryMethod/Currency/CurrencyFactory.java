/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod1;

/**
 *
 * @author 40111067
 */
public class CurrencyFactory {
    
    // Factory method returns correct currency
    public static Currency createCurrency(String country){
        
        if(country.equals("UK")){
            return new GBP();
        } else if(country.equals("US")){
            return new USD();
        } else {
            return null;
        }
    }
    
}
