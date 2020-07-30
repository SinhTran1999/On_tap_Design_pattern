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
public class SinhVienDB extends EntityDB<SinhVien>{
     @Override
    protected SinhVien findByID(int id) {
        for (SinhVien sv : list) {
            if(sv.getMaSV()== id)
                return sv;
        }
        return null;
    }

    @Override
    protected int getKey(SinhVien t) {
        return t.getMaSV();
    }
}
