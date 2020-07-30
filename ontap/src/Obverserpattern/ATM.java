/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obverserpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tophu
 */
public class ATM {
    ATM_observer observer;

    public ATM() {
    }
    
    public void laythongtintaikhoan(ATM_observer observer){
        this.observer = observer;
    }
    
    public boolean kiemtratienrut(float tienrut)
    {
        return observer.kiemtrasodu(tienrut);
    }
    
    public void ruttien(float tienrut){
        if(kiemtratienrut(tienrut))
        {
            observer.nhanthongbao(tienrut, "Giao dịch thành công");
        }
        else
            observer.nhanthongbao(tienrut, "Không đủ tiền để rút");
    }
    
    public static interface ATM_observer{
        public boolean kiemtrasodu(float tienrut);
        public void nhanthongbao(float tienrut, String thongbao);
    }
}
