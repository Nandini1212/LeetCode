/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nandini
 */
public class MovingAverageFromDataStream {
    int newSize = 0;
    int index = 0;
    double sum = 0;
    Queue<Integer>queue = new LinkedList<Integer>();
    
    public void MovingAverage(int size){
        newSize = size;
    }
    public double next(int val){
        sum += val;
        queue.offer(val);
        if(index++ >= newSize){
            sum -= queue.remove();
        }
        return sum / queue.size();
        
    }
    public static void main(String[]args){
        MovingAverageFromDataStream mv = new MovingAverageFromDataStream();
        mv.MovingAverage(3);
        System.out.println(mv.next(1));
        System.out.println(mv.next(10));
        System.out.println(mv.next(3));
        
    }
}
