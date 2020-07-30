/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeKhoa;

import compositepattern.abstractfile;
import compositepattern.file;
import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class Bomon extends abstractkhoa{
    
     ArrayList<abstractkhoa> ListGV = new ArrayList<>();

    public Bomon(String Ten) {
        super(Ten);
    }

    @Override
    public void add(abstractkhoa f) {
        if(ListGV.contains(f))
            return;
        if(f instanceof Giangvien)
        {
            ListGV.add(f);
            f.setPath(this.path + "/" + f.path);
        }
        else
            System.out.println("Không thêm được!");
        return;
    }

    @Override
    public void remove(abstractkhoa f) {
        if(ListGV.contains(f))
        {
            ListGV.remove(f);
            return;
        }
        for(abstractkhoa Bomon: ListGV)
            Bomon.remove(f);
    }

    @Override
    public String gettreefolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(Ten).append(":\n");
        for(abstractkhoa f: ListGV)
        {
            if(f instanceof Giangvien)
                builder.append("\n").append(f.gettreefolder());
            else
                builder.append("\n").append(f.gettreefolder());
        }
        return builder.append("\n").toString();
    }
    
}
