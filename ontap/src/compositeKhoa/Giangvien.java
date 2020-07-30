/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeKhoa;

import compositepattern.abstractfile;

/**
 *
 * @author tophu
 */
public class Giangvien  extends  abstractkhoa{
    public Giangvien(String Ten) {
        super(Ten);
    }
    
    @Override
    public void add(abstractkhoa f) {
    }

    @Override
    public void remove(abstractkhoa f) {
    }

    @Override
    public String gettreefolder() {
        return Ten;
    }

}
