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
public class action implements facade{
    
    ArrayList<product> list;

    public action(ArrayList<product> list) {
        this.list = list;
    }
    
    @Override
    public void hienthids() {
        System.out.println("danh sách các sản phẩm: ");
        for(product product: list)
        {
            System.out.println(thongtinsp(product));
        }
    }

    @Override
    public void inhoadon() {
        hienthids();
        int tongtien = 0;
        System.out.println("\nTổng tiền cần trả: ");
        for(product product: list)
        {
            tongtien += product.getGia() * product.getSoluong();
        }
        System.out.println(tongtien + "VNĐ");
    }

    @Override
    public void hienthi_va_demsoluong() {
        hienthids();
        demsoluong(list);
    }
    
    public String thongtinsp(product product)
    {
        return "\n" + product.getTen() + ", " + product.getGia() + ", " + product.getSoluong();
    }
    
    public void demsoluong(ArrayList<product> list)
    {
        int soluong = 0;
        System.out.println("\nTổng cộng có: ");
        for(product product: list)
        {
            soluong +=  product.getSoluong();
        }
        System.out.println(soluong + " sản phẩm!");
    }
}
