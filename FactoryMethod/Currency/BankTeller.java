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
public class BankTeller {
    public static void main(String[] args) {
        
        String symbol;
        
        // Call factory method to get the correct currency
        Currency currency = CurrencyFactory.createCurrency("UK");
        symbol = currency.getCurrencySymbol();
        
        System.out.println(symbol);
        
        // Call factory method to get the correct currency
        Currency currency1 = CurrencyFactory.createCurrency("US");
        symbol = currency1.getCurrencySymbol();
        
        System.out.println(symbol);
    }
}
