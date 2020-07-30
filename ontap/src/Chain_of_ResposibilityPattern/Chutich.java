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
public class Chutich {
    int tienvay, hanmuc;
    String Ten;

    public Chutich(int tienvay ,int hanmuc, String Ten) {
        this.tienvay = tienvay;
        this.hanmuc = hanmuc;
        this.Ten = Ten;
    }
    
    public boolean kiemtra(){
        return (tienvay < hanmuc);
    }
    
    public void duyet(){
        if(kiemtra())
        {
            StringBuilder builder = new StringBuilder();
            builder.append("Chủ tịch ")
                    .append(Ten)
                    .append(" Đã duyệt");
            System.out.println(builder.toString());
        }
        else
        {
            System.out.println("Hết cách! \n");
        }
    }
}
