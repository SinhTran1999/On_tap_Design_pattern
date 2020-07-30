/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author tophu
 */
public class buildermain {
    public static void main(String[] args) throws ParseException {
        CTHD SP1 = new CTHD("Kem đánh răng", 2, 12000, (float) 0.9);
        CTHD SP2 = new CTHD("USB", 4, 140000, (float) 0.95);
        CTHD SP3 = new CTHD("LapTop", 1, 14000000, (float) 0.9);
        Hoadonheader HD = new Hoadonheader("HD001", "Tô Phước Thái", 
                new SimpleDateFormat("dd/MM/yy").parse("04/01/2020"));
        Hoadon HD1 = new Hoadon.builder()
                .setheader(HD)
                .addchitiet(SP1)
                .addchitiet(SP2)
                .addchitiet(SP3)
                .build();
        System.out.println(HD1.toString());
        
        
        Hoadonsingleton HD2 = new Hoadonsingleton.buildersingleton()
                .setheader(HD)
                .addchitiet(SP1)
                .addchitiet(SP2)
                .addchitiet(SP3)
                .build();
        
        System.out.println("\n builder singleton: \n"+HD2.toString());
        
         Hoadonsingleton HD3 = Hoadonsingleton.Createinstance();
         
         System.out.println("\n"+HD3.toString());
        
    }
}
