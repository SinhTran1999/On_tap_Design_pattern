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
public class file extends abstractfile{
    public file(String Ten) {
        super(Ten);
    }
    
    public void add(abstractfile f) {     
    }

    @Override
    public void remove(abstractfile f) {
    }

    @Override
    public String gettreefolder() {
        return Ten;
    }
}
