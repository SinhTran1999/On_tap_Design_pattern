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
public class Triangle extends Shape{
    public Triangle() {
        Brush += "Vẽ hình tam giác: \n";
    }

    @Override
    public String Draw() {
        Brush += "Brush: Bút bi \n";
        Paper += "Paper: Giấy trắng\n";
        Frame += "Frame: Khung thiết";
        return Brush + Paper + Frame;
    }
    
}
