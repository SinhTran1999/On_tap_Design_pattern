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
public class factorymain {
    public static void main(String[] args) {
        
//        ShapeFactory hinha = new ShapeFactory(Shapetype.Triangle);
//        Shape Ha = hinha.createShape();
//        ShapeFactory hinhb = new ShapeFactory(Shapetype.Circle);
//        Shape Hb = hinhb.createShape();
//        ShapeFactory hinhc = new ShapeFactory(Shapetype.Rectangle);
//        Shape Hc = hinhc.createShape();
//        
//        System.out.println("Factory pattern:\n");
//        System.out.println(Ha.Draw()+"\n");
//        System.out.println(Hb.Draw()+"\n");
//        System.out.println(Hc.Draw()+"\n");
        
        System.out.println("\n Singleton: ");
        ShapeFactorySingleton Hinh1 = ShapeFactorySingleton.Createinstance();
        ShapeFactorySingleton Hinh2 = ShapeFactorySingleton.Createinstance();
        ShapeFactorySingleton Hinh3 = ShapeFactorySingleton.Createinstance();
        
        Hinh1.setType(Shapetype.Triangle);
        Shape H1 = Hinh1.createShape();
        
       System.out.println("\n" + H1.Draw());
        
        Hinh2.setType(Shapetype.Circle);
        H1 = Hinh1.createShape();
        Shape H2 = Hinh2.createShape();
        
        System.out.println("\n" + H1.Draw());
        System.out.println(H2.Draw());
        
        Hinh3.setType(Shapetype.Rectangle);
        H1 = Hinh1.createShape();
        H2 = Hinh2.createShape();
        Shape H3 = Hinh3.createShape();
        System.out.println("\n" + H1.Draw());
        System.out.println(H2.Draw());
        System.out.println(H3.Draw());
    }
}
