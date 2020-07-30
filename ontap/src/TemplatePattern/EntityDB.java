    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tophu
 */
public abstract class EntityDB<T> {
    protected List<T> list;

    public EntityDB() {
        list = new ArrayList<>();
    }
    
    public boolean add(T t){
        int key = getKey(t);
        T target = findByID(key);
        if(target != null)
            return false;
        list.add(t);
        return true;
    }
    
    public int update(T t){
        int key = getKey(t);
        T target = findByID(key);
        if(target != null){
            list.set(list.indexOf(target), t);
            return 1;
        }
        return 0;
    }
    
    public int delete(T t){
	int key = getKey(t);
	T target = findByID(key);
	if(target != null){
            list.remove(target);
            return 1;
	}
	return 0;
    }
    
    public int deleteByKey(int id){
        T target = findByID(id);
        if(target != null){
            list.remove(target);
            return 1;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (T t : list) {
            str += t.toString() + "\n";
        }
        return str;
    }
    
    protected abstract T findByID(int id);
    protected abstract int getKey(T t);
}
