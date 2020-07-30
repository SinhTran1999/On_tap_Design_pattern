/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

/**
 *
 * @author tophu
 */
public class MonHocDB extends EntityDB<MonHoc>{
     @Override
    protected MonHoc findByID(int id) {
        for (MonHoc mh : list) {
            if(mh.getMaMH()== id)
                return mh;
        }
        return null;
    }

    @Override
    protected int getKey(MonHoc t) {
        return t.getMaMH();
    }
}
