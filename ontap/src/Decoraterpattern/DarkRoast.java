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
public class DarkRoast extends Beverage{

    public DarkRoast(String Description) {
        super(Description);
    }
    
    @Override
    public float cost() {
        return 15000;
    }
    
}
