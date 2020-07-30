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
public abstract class Iterator {
    public abstract int first();
    public abstract int next();
    public abstract boolean isdone();
    public abstract int last();
    public abstract int current();
}
