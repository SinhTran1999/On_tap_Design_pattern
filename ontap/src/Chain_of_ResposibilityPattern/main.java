    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_of_ResposibilityPattern;

import java.util.Scanner;

/**
 *
 * @author tophu
 */
public class main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n Nhập số tiền cần vay: ");
        int tien= 0;
        tien = scanner.nextInt();
        
        NhanVien nhanVien = new NhanVien(tien, 100, "thái", 
                new Phophong(tien, 120, "Tuấn", 
                       new Truongphong(tien, 140, "Dũng",
                            new Giamdoc(tien, 160, "Châu", 
                                new Chutich(tien, 180, "Khoa"))) ));
        nhanVien.duyet();
    }
}
