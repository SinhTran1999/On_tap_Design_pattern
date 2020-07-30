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
public class mocha extends CondimentDecorator{

    public mocha(Beverage component, String Description) {
        super(component, Description);
    }

    @Override
    public float cost() {
        return component.cost() + 3000;
    }
    
}
