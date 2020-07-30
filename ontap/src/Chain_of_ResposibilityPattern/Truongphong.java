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
public class Truongphong {
    int tienvay, hanmuc;
    String Ten;
    Giamdoc captren;

    public Truongphong(int tienvay ,int hanmuc, String Ten, Giamdoc captren) {
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
            builder.append("Trưởng phòng ")
                    .append(Ten)
                    .append(" Đã duyệt");
            System.out.println(builder.toString());
        }
        else
        {
            System.out.println("Chuyển lên cho Giám đốc! \n");
            captren.duyet();
        }
    }
}
