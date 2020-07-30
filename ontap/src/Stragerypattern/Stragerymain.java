/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stragerypattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author tophu
 */
public class Stragerymain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        QLSV QLDS = new QLSV();
        SinhVien SV1 = new SinhVien("Tô Phước Thái",new SimpleDateFormat("dd/MM/yy").parse("04/11/1991"), 9);
        SinhVien SV2 = new SinhVien("Dương Thị Mai",new SimpleDateFormat("dd/MM/yy").parse("18/10/1998"), 7);
        SinhVien SV3 = new SinhVien("Lê Thế Dũng",new SimpleDateFormat("dd/MM/yy").parse("14/05/1998"), 10);
        
        QLDS.them(SV1);
        QLDS.them(SV2);
        QLDS.them(SV3);
        
        System.out.println("\n Danh sách sinh viên lúc đầu:");
        QLDS.inDS();
        
        ISoSanh sstheodiem = new SoSanhTheoDiem();
        ISoSanh sstheoten = new SoSanhTheoTen(); 
        
        QLDS.setSoSanh(sstheoten);
        QLDS.sapXep();
        System.out.println("\n Danh sách sinh viên sắp xếp theo tên: ");
        QLDS.inDS();
        
        QLDS.setSoSanh(sstheodiem);
        QLDS.sapXep();
        System.out.println("\n Danh sách sinh viên sắp xếp theo điểm: ");
        QLDS.inDS();
    }
    
}
