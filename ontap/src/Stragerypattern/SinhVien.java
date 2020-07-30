/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stragerypattern;
import java.util.Date;
/**
 *
 * @author tophu
 */
public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public void hienthiTT(){
        System.out.println("Họ và tên:" + hoTen);
        System.out.println("Ngày sinh" + ngaySinh);
        System.out.println("Điểm Trung Bình:" + diemTB);
    }
}
