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
public class ConcreteAggregate extends Aggregate <Iterator>
{
    int[] Arr;

    public ConcreteAggregate(int[] Arr) {
        this.Arr = Arr;
    }

    public int[] getArr() {
        return Arr;
    }
    
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
