/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterJtablepattern;

/**
 *
 * @author tophu
 */
public class SinhVien {
    String TenSV;
    String QueQuan;
    String ngaysinh;

    public SinhVien(String TenSV, String QueQuan, String ngaysinh) {
        this.TenSV = TenSV;
        this.QueQuan = QueQuan;
        this.ngaysinh = ngaysinh;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    
}
