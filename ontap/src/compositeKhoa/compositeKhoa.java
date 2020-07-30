/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeKhoa;

/**
 *
 * @author tophu
 */
public class compositeKhoa {
    public static void main(String[] args) {
        Khoa CNTT = new Khoa("CNTT");
        Bomon Toan = new Bomon("Toán");
        Bomon Giaitich = new Bomon("Giải tích");
        Bomon C = new Bomon("C++");
        
        CNTT.add(C);
        CNTT.add(Toan);
        CNTT.add(Giaitich);
        
        Giangvien Thai = new Giangvien("Thái");
        Giangvien Tuan = new Giangvien("Tuấn");
        Giangvien Khoa = new Giangvien("Khoa");
        
        Toan.add(Thai);
        Toan.add(Tuan);
        Giaitich.add(Khoa);
        
        System.out.println(Khoa.getPath());
        
        System.out.println("\nKiểm tra: ");
        C.add(Toan);
    }
}
