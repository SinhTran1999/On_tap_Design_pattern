/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facadepattern;

import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class facademain {
    
    public static void main(String[] args) {
        product p1 = new product("USB", 3, 100000);
        product p2 = new product("RAM", 6, 200000);
        product p3 = new product("CPU", 4, 300000);
        
        ArrayList<product> list = new ArrayList<>();
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        facade remote = new action(list);
        
        System.out.println(" Kiểm tra lệnh hiển thị: \n");
        
        remote.hienthids();
        
        System.out.println("\n Kiểm tra lệnh in hóa đơn: \n");
        
        remote.inhoadon();
        
        System.out.println("\n Kiểm tra lệnh hiển thị kèm đếm số lượng: \n");
        
        remote.hienthi_va_demsoluong();
        
    }
}
