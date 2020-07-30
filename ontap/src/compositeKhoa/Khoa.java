/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeKhoa;

import java.util.ArrayList;

/**
 *
 * @author tophu
 */
public class Khoa extends abstractkhoa{
    ArrayList<abstractkhoa> ListBM = new ArrayList<>();

    public Khoa(String Ten) {
        super(Ten);
    }

    @Override
    public void add(abstractkhoa f) {
        if(ListBM.contains(f))
            return;
        if(f instanceof Bomon)
        {
             ListBM.add((Bomon)f);
            f.setPath(this.path + "/" + f.path);
        }
        else
            System.out.println("Không thêm được! ");
        return;
    }

    @Override
    public void remove(abstractkhoa f) {
        if(ListBM.contains(f))
        {
            ListBM.remove(f);
            return;
        }
        for(abstractkhoa Bomon: ListBM)
            Bomon.remove(f);
    }

    @Override
    public String gettreefolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(Ten).append(":\n");
        for(abstractkhoa f: ListBM)
        {
            if(f instanceof Bomon)
                builder.append("\n").append(f.gettreefolder());
            else
                builder.append("\n").append(f.gettreefolder());
        }
        return builder.append("\n").toString();
    }
    
}
