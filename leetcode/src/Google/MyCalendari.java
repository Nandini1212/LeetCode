/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nandini
 */

public class MyCalendari {
   private Set<Interval> set;

    public void  MyCalendar() {
        set = new TreeSet<>((a, b) -> {
            if(a.end <= b.start) return -1;
            else if(a.start >= b.end) return 1;
            else return 0;
        });
    }
    
    public boolean book(int start, int end) {
        Interval interval = new Interval();
        interval.start = start;
        interval.end = end;
        if(set.contains(interval))
            return false;
        set.add(interval);
        return true;
    }
    
    private static class Interval {
        int start;
        int end;
    }
}
