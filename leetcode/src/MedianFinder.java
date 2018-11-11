
import java.util.Collections;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class MedianFinder {
     PriorityQueue<Long> minPQ; // remove min, represent bigger half
    PriorityQueue<Long> maxPQ; // remove max, represent smaller half
    
    public MedianFinder() {
        minPQ = new PriorityQueue<>();
        maxPQ = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        minPQ.add((long)num);
        maxPQ.add((long)minPQ.remove());
        if (minPQ.size() < maxPQ.size()) {
            minPQ.add(maxPQ.remove()); // minPQ more
        }
    }
    
    public double findMedian() {
        if (minPQ.size() > maxPQ.size()) {
            return minPQ.peek();
        }
        return (minPQ.peek() + maxPQ.peek()) / 2.0;
    }

    public static void main(String[]args){
        MedianFinder mf = new MedianFinder();
        mf.addNum(2);
        System.out.println(mf.findMedian());
        mf.addNum(1);
        System.out.println(mf.findMedian());
        mf.addNum(5);
        mf.addNum(7);
        System.out.println(mf.findMedian());
        mf.addNum(2);
        mf.addNum(0);
        System.out.println(mf.findMedian());
        mf.addNum(5);
        System.out.println(mf.findMedian());
        
    }
}
