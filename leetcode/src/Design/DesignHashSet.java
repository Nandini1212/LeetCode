/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nandini
 */
public class DesignHashSet {
     /** Initialize your data structure here. */
    List<Integer> list;
    
    public void MyHashSet() {
        list = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!list.contains(key)){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int val = it.next();
            if(val == key){
                it.remove();
                return;
            }
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(list.contains(key)){
            return true;
        }
        return false;
    }
}
