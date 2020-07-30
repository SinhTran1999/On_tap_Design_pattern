/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author tophu
 */
public class IteratorMain {
    public static void main(String[] args) {
        int[] Arr = {1,2,3,4,5,6,7,8,9,10};
        Aggregate A = new ConcreteAggregate(Arr);
        Iterator B = (Iterator) A.createIterator();
        System.out.println("Hàm first: " + B.first());
        System.out.println("Hàm current: " + B.current());
        System.out.println("Hàm next: " + B.next());
        System.out.println("Hàm kiểm tra current: " + B.current());
        System.out.println("Hàm kiểm tra isdone: " + B.isdone());
    }
    
}
