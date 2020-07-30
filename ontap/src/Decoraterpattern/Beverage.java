/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decoraterpattern;

/**
 *
 * @author tophu
 */
public abstract class Beverage {
    String Description;

    public String getDescription() {
        return Description;
    }

    public Beverage(String Description) {
        this.Description = Description;
    }
    
    public abstract float cost();
    
}
