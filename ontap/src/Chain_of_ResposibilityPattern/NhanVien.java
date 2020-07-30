    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_of_ResposibilityPattern;

/**
 *
 * @author tophu
 */
public class NhanVien {
    int tienvay, hanmuc;
    String Ten;
    Phophong captren;

    public NhanVien(int tienvay ,int hanmuc, String Ten, Phophong captren) 
    {
        this.tienvay = tienvay;
        this.hanmuc = hanmuc;
        this.Ten = Ten;
        this.captren = captren;
    }
    
    public boolean kiemtra(){
        return (tienvay < hanmuc);
    }
    
    public void duyet(){
        if(kiemtra())
        {
            StringBuilder builder = new StringBuilder();
            builder.append("Nhân viên ")
                    .append(Ten)
                    .append(" Đã duyệt \n");
            System.out.println(builder.toString());
        }
        else
        {
            System.out.println("Chuyển lên cho phó phòng! \n");
            captren.duyet();
        }
    }
}
