/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommandPattern;

/**
 *
 * @author tophu
 */
public class CommandMain {
    public static void main(String[] args) {
        Store store = new Store();
        giohang gh = new giohang();
        dathangCommand cmd1 = new dathangCommand(new Chitietgiohang("CPU", 1, 100), store);
        dathangCommand cmd2 = new dathangCommand(new Chitietgiohang("RAM", 3, 50), store);
        dathangCommand cmd3 = new dathangCommand(new Chitietgiohang("USB", 2, 40), store);
        
        gh.addcommand(cmd1);
        gh.addcommand(cmd2);
        gh.addcommand(cmd3);
        gh.xacnhanmua();
        
        System.out.println("\n Kiểm tra lệnh undo: \n");
        gh.undo();
        gh.xacnhanmua();
        
         System.out.println("\n Kiểm tra lệnh redo: \n");
        gh.redo();
        gh.xacnhanmua();
    }
}
