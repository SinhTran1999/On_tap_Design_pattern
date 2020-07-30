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
public class ConcreteIterator extends Iterator{
    ConcreteAggregate A;
    int position = 0;

    public ConcreteIterator(ConcreteAggregate A) {
        this.A = A;
    }

    @Override
    public int first() {
        position = 0;
        return A.getArr()[0];
    }

    @Override
    public int next() {
        if(position < A.getArr().length)
        {
            position+=1;
            return A.getArr()[position];
        }
        return -1;
    }

    @Override
    public boolean isdone() {
        return (position == A.getArr().length);
    }

    @Override
    public int current() {
        return A.getArr()[position];
    }

    @Override
    public int last() {
        return A.getArr()[A.getArr().length - 1];
    }
    
}
