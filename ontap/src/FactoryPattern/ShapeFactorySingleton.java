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
public class ShapeFactorySingleton {
    public static ShapeFactorySingleton instance;
    
    Shapetype Type ;

    public Shapetype getType() {
        return Type;
    }

    public void setType(Shapetype Type) {
        this.Type = Type;
    }
   
    public static ShapeFactorySingleton Createinstance(){
        if(instance == null)
            instance = new ShapeFactorySingleton();
        return instance;
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
