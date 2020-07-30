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
public class milk extends CondimentDecorator{

    public milk(Beverage component, String Description) {
        super(component, Description );
    }
    

    @Override
    public float cost() {
        return component.cost() + 5000;
    }
    
}
