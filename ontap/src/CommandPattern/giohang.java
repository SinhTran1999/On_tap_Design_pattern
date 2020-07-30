    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tophu
 */
public class giohang {
    List<dathangCommand> duyet = new ArrayList<>();
    List<dathangCommand> chuaduyet = new ArrayList<>();

    public giohang() {
    }

    public List<dathangCommand> getduyet() {
        return duyet;
    }
    
     public void addcommand(dathangCommand cmd) {
         System.out.println("\n Đã thêm " + cmd.getProduct().getTenhang() + " vào giỏ hàng!");
         duyet.add(cmd);
    }
 
    public void undo() {
        if (!duyet.isEmpty()) {
            System.out.println("\n Đã bỏ " + duyet.get(duyet.size()-1).getProduct().getTenhang() + " ra khỏi giỏ hàng!");
            chuaduyet.add(duyet.get(duyet.size()-1));
            duyet.remove(duyet.size() - 1);
        } else {
            System.out.println("Không còn hàng để hủy!");
        }
    }
    
    public void redo()
    {
        if (!chuaduyet.isEmpty()) {
            System.out.println("\n Đã thêm lại " + chuaduyet.get(chuaduyet.size()-1).getProduct().getTenhang() + " vào giỏ hàng!");
            duyet.add(chuaduyet.get(chuaduyet.size()-1));
            chuaduyet.remove(chuaduyet.size() - 1);
        } else {
            System.out.println("đã thêm lại hết!!");
        }
    }
    
    public void xacnhanmua()
    {
        int tong = 0;
        System.out.println("Danh sách các món hàng đã mua:");
        for(dathangCommand cmd : duyet)
        {
            cmd.excute();
            tong = cmd.getThanhtien();
        }
        System.out.println("\n Tổng cộng: " + tong);
    }
}
