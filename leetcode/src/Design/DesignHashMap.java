/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author nandini
 */
public class DesignHashMap {
    /** Initialize your data structure here. */
    
    private int [] myMap = new int [1000010];
    public void MyHashMap() {
        for(int i = 0; i < 1000000; i++){
            myMap[i] = -1;
        }
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        myMap[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return myMap[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        myMap[key] = -1;
    }
}
