/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeKhoa;

/**
 *
 * @author tophu
 */
public abstract class abstractkhoa {
    String Ten;
    String path;

    public abstractkhoa(String Ten) {
        this.Ten = Ten;
        this.path = Ten;
    }
    
    public abstract void add(abstractkhoa f);
    public abstract void remove(abstractkhoa f);
    public abstract String gettreefolder();
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
