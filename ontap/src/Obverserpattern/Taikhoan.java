    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obverserpattern;

public class Taikhoan implements ATM.ATM_observer{
    float sodu;

    public float getSodu() {
        return sodu;
    }
    
    public void Dangnhap(ATM t){
        t.laythongtintaikhoan((ATM.ATM_observer) this);
    }
   
    
    public Taikhoan(float sodu) {
        this.sodu = sodu;
    }

    public void setSodu(float sodu) {
        this.sodu = sodu;
    }

    @Override
    public boolean kiemtrasodu(float tienrut) {
        return (this.sodu >= tienrut);
    }

    @Override
    public void nhanthongbao(float tienrut, String thongbao) {
        System.out.println("\n" + thongbao);
        if(kiemtrasodu(tienrut))
        {
            this.sodu -= tienrut;
        System.out.println("\n" + "Số dư còn lại: " + this.sodu);
        }
    }
}
