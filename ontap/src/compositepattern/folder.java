/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;
import java.util.ArrayList;
/**
 *
 * @author tophu
 */
public class folder extends abstractfile{
    
    ArrayList<abstractfile> file = new ArrayList<>();

    public folder(String Ten) {
        super(Ten);
    }
    
    @Override
    public void add(abstractfile f) {
        if(file.contains(f))
            return;
        file.add(f);
        f.setPath(this.path + "/" + f.path);
    }

    @Override
    public void remove(abstractfile f) {
        if(file.contains(f))
        {
            file.remove(f);
            return;
        }
        for(abstractfile folder: file)
            folder.remove(f);
    }

    @Override
    public String gettreefolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(Ten).append(":\n");
        for(abstractfile f: file)
        {
            if(f instanceof file)
                builder.append("\n").append(f.gettreefolder());
            else
                builder.append("\n").append(f.gettreefolder());
        }
        return builder.append("\n").toString();
    }
    
}
