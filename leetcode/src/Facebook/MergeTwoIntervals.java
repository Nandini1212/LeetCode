/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nandini
 */
class Interval{
     int start;
     int end;
    
    Interval(){
        start = 0;
        end = 0;
    }
    Interval(int s, int e){
        start = s;
        end = e;
    }
}
class IntervalComparator implements Comparator<Interval>
{
    public int compare(Interval i1, Interval i2)
    {
        return i1.start - i2.start;
    }
}
//time complexity : O(n)
//space complexity: 
public class MergeTwoIntervals {
    
   public static List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() == 0 || intervals.size() == 1){
            return intervals;
        }
        //sort intervals according to start value
        Collections.sort(intervals, new IntervalComparator());
        
        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;

        ArrayList<Interval> result = new ArrayList<Interval>();

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            if (current.start <= end) {
                end = Math.max(current.end, end);
            } else {
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }
    

    
     public static void main (String[] args) throws java.lang.Exception {
        List<Interval> x = new ArrayList<>();

        x.add(new Interval(1, 3));
        x.add(new Interval(2, 6));
        x.add(new Interval(8, 10));
        x.add(new Interval(15, 18));
        x.add(new Interval(17, 20));

        x = merge(x);

        for(Interval i : x)
        {
            System.out.println(i.start + " " + i.end);
        }
}
}
