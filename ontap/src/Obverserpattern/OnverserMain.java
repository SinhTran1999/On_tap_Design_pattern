/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obverserpattern;

import java.util.Scanner;

/**
 *
 * @author tophu
 */
public class OnverserMain {
    
    public static void main(String[] args) 
    {
        
        ATM atm = new ATM();
        Taikhoan Thai = new Taikhoan(100);
       
        Thai.Dangnhap(atm);
        
        System.out.println("Số dư trong tài khoản: " + Thai.getSodu());
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Nhập số tiền cần rút: ");
        float tien= 0;
        tien = scanner.nextFloat();
        atm.ruttien(tien);
    }
}
