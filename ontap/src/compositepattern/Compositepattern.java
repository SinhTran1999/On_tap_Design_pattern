/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author tophu
 */
public class Compositepattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        abstractfile data = new folder("Data");
        abstractfile Toan = new folder("Toán");
        abstractfile Ly = new folder("Lý");
        abstractfile Hoa = new folder("Hóa");
        abstractfile DSSV = new file("Danhsachsinhvien.xlsx");
        data.add(Toan);
        data.add(Ly);
        data.add(Hoa);
        
        abstractfile Giaitich = new folder("Giải tích");
        abstractfile Daiso = new folder("Đại số");
        Toan.add(Giaitich);
        Toan.add(Daiso);
        
        abstractfile ToanA = new file("ToanA.pdf");
        abstractfile ToanB = new file("ToanB.pdf");
        Giaitich.add(ToanA);
        Giaitich.add(ToanB);
        abstractfile DaisoTT = new file("DaisoTT.pdf");
        Daiso.add(DaisoTT);
        
        abstractfile Cohoc = new file("Cohoc.pdf");
        abstractfile Quanghoc = new file("Quanghoc.pdf");
        Ly.add(Cohoc);
        Ly.add(Quanghoc);
        
        System.out.println(Cohoc.getPath());
        System.out.println(Giaitich.gettreefolder());
        System.out.println(data.gettreefolder());
    }
}
