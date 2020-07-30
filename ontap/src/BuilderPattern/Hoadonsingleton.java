/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class Hoadonsingleton {
    Hoadonheader header = new Hoadonheader();
    ArrayList<CTHD> chitiet = new ArrayList<>();

    
     protected Hoadonsingleton(buildersingleton builder) {
        this.header = builder.header;
        this.chitiet = builder.chitiet;
    }

    public String hienthiCTHD(){
        String ht = "";
        for(int i = 0; i < chitiet.size(); i++){
            ht+= "\nTên sản phẩm: " + chitiet.get(i).getTenSP()
                +"\tSố lượng: " + chitiet.get(i).getSoluong()
                +"\tĐơn giá: " + chitiet.get(i).getDongia()
                +"\tChiết khấu: " + chitiet.get(i).getChietkhau();
            }
        return ht;
    }

    @Override
    public String toString() {
        return "chi tiết hóa đơn: \nMã Hóa đơn: " + header.getMaHD() +
                "\nTên khách hàng: " + header.getTenKH() +
                "\nNgày bán: " + header.getNgayban()
                +"\nDanh sách sản phẩm: " + hienthiCTHD();
    }
    
    
    public static class buildersingleton{
        Hoadonheader header = new Hoadonheader();
        ArrayList<CTHD> chitiet = new ArrayList<>();
        
        public buildersingleton setheader(Hoadonheader HD){
            this.header = HD;
            return this;
        }
        
        public buildersingleton addchitiet(CTHD p){
            this.chitiet.add(p);
            return this;
        }
        
        public Hoadonsingleton build(){
            if(instance == null)
                instance = new Hoadonsingleton();
            instance.chitiet = this.chitiet;
            instance.header = this.header;
            return instance;
        }
    }
    
    

    public Hoadonsingleton() {
    }
    
    
    public static Hoadonsingleton instance;
    
    
    public static Hoadonsingleton Createinstance(){
        return instance;
    }
    
}
