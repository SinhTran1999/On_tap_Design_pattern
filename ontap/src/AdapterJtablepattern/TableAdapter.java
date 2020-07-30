/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterJtablepattern;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author tophu
 */
public class TableAdapter {
    
    public static TableModel listAdapter(ArrayList<SinhVien> listSV){
        DefaultTableModel tablemodel = null;
        Vector data, header;
        data = new Vector();
        header = new Vector();
        for(SinhVien sv: listSV)
        {
            Vector row = new Vector();
            row.add(sv.TenSV);
            row.add(sv.QueQuan);
            row.add(sv.ngaysinh);
            data.add(row);
        }
        
        header.add("Họ tên");
        header.add("Quê Quán");
        header.add("Ngày Sinh");
        tablemodel = new DefaultTableModel(data, header);
        return tablemodel;
    }
}
