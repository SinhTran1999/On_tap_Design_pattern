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
public class MonHoc {
    private int maMH;
    private String tenMH;
    private int soTC;

    public MonHoc(int maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "maMH: " + maMH + " |tenMH: " + tenMH + " |soTC:" + soTC;
    }
}
