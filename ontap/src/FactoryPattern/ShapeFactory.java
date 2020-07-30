/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author tophu
 */
public class ShapeFactory {
    
    Shapetype Type ;

    public ShapeFactory(Shapetype Type) {
        this.Type = Type;
    }
    
     public Shape createShape(){
         switch(this.Type){
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            case Circle: return new Circle();
        }
        return null;
     }
}
