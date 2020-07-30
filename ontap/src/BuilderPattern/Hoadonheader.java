/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import java.util.Date;

/**
 *
 * @author tophu
 */
public class Hoadonheader {
    String MaHD, TenKH;
    Date Ngayban;

    public Hoadonheader(String MaHD, String TenKH, Date Ngayban) {
        this.MaHD = MaHD;
        this.TenKH = TenKH;
        this.Ngayban = Ngayban;
    }

    public Hoadonheader() {
    }

    
    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public Date getNgayban() {
        return Ngayban;
    }

    public void setNgayban(Date Ngayban) {
        this.Ngayban = Ngayban;
    }
    
    
}
