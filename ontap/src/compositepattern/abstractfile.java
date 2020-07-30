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
public abstract class abstractfile {
    String Ten;
    String path;

    public abstractfile(String Ten) {
        this.Ten = Ten;
        this.path = Ten;
    }
    
    public abstract void add(abstractfile f);
    public abstract void remove(abstractfile f);
    public abstract String gettreefolder();
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
