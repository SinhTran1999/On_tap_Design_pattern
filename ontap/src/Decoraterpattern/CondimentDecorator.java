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
public abstract class CondimentDecorator extends Beverage{
    Beverage component;

    public CondimentDecorator(Beverage component, String Description) {
        super(Description);
        this.component = component;
    }

    @Override
    public String getDescription() {
        return super.getDescription(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
