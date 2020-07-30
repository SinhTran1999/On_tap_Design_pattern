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
public class Decorator {
    public static void main(String[] args) {
        Beverage dr = new DarkRoast("Cafe đen số 1 thế giới");
        System.out.println(dr.getDescription());
        dr = new milk(dr,"Thêm sữa");
        System.out.println(dr.getDescription()+ ", Giá 1:" + dr.cost());
        dr = new  mocha(dr,"Thêm mocha");
        System.out.println(dr.getDescription()+ ", Giá 2:" + dr.cost());
    }
}
