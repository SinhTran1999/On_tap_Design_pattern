    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

public class Chitietgiohang{
    String Tenhang;
    int soluong;
    int dongia;

    public Chitietgiohang(String Tenhang, int soluong, int dongia) {
        this.Tenhang = Tenhang;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public Chitietgiohang() {
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String Tenhang) {
        this.Tenhang = Tenhang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }   
    
}
