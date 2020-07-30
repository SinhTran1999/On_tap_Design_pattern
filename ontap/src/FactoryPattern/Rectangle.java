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
public class Rectangle extends Shape{

    public Rectangle() {
        Brush += "Vẽ hình chữ nhật: \n";
    }

    @Override
    public String Draw() {
        Brush += "Brush: Bút chì \n";
        Paper += "Paper: Giấy kẻ ô\n";
        Frame += "Frame: Khung gỗ";
        return Brush + Paper + Frame;
    }
    
    
}
