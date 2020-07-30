/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

import java.util.GregorianCalendar;

/**
 *
 * @author tophu
 */
public class TemplateMain {
    public static void main(String[] args) {
        EntityDB svdb = new SinhVienDB();
        svdb.add(new SinhVien(59136167, "Tô Phước Thái", new GregorianCalendar(1991, 11, 04), "Nha Trang"));
        svdb.add(new SinhVien(59130405, "Nguyễn Thái Tuấn", new GregorianCalendar(1999, 3, 15), "Ninh Hoa"));
        svdb.add(new SinhVien(59131660, "Trương Hoàn Khoa", new GregorianCalendar(1999, 9, 10), "Nha Trang"));
        
        System.out.println("\nDanh sách sinh viên:\n"+svdb.toString());
        
        svdb.deleteByKey(59131660);
        System.out.println("\nDanh sách sinh viên sau khi xóa:\n"+svdb.toString());
        
        svdb.add(new SinhVien(59132942, "Lê Thế Dũng", new GregorianCalendar(1998, 11, 11), "Nha Trang"));
        System.out.println("\nDanh sách sinh viên sau khi thêm:\n"+svdb.toString());
        
        svdb.update(new SinhVien(59132942, "Trương Hoàn Khoa", new GregorianCalendar(1998, 11, 11), "Nha Trang"));
        System.out.println("\nDanh sách sinh viên sau khi cập nhật:\n"+svdb.toString());
        
        EntityDB mhdb = new MonHocDB();
        mhdb.add(new MonHoc(001, "Mẫu thiết kế", 2));
        mhdb.add(new MonHoc(002, "Cơ sở dữ liệu", 3));
        mhdb.add(new MonHoc(003, "Lập trình android", 4));
        
        System.out.println("\nDanh sách môn học:\n"+mhdb.toString());
        
        mhdb.deleteByKey(001);
        System.out.println("\nDanh sách môn học sau khi xóa:\n"+mhdb.toString());
        
        mhdb.add(new MonHoc(004, "Java", 2));
        System.out.println("\nDanh sách sinh viên sau khi thêm:\n"+mhdb.toString());
        
        mhdb.update(new MonHoc(004, "C++", 2));
        System.out.println("\nDanh sách sinh viên sau khi cập nhật:\n"+mhdb.toString());
    }
}
