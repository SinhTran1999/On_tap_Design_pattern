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
public class Circle extends Shape{
public Circle() {
        Brush += "Vẽ hình Tròn: \n";
    }

    @Override
    public String Draw() {
        Brush += "Brush: Bút mực \n";
        Paper += "Paper: Giấy màu\n";
        Frame += "Frame: Khung sắt";
        return Brush + Paper + Frame;
    }
    
}
