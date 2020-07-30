  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author tophu
 */
public class Store {
    public int tinhtien(Chitietgiohang product)
    {
        return product.getDongia() * product.getSoluong();
    }
    
    public void huy()
    {
        System.out.println("Đã hủy đơn hàng!");
    }
}
