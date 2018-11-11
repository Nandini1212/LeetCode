/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nandini
 */
class Interval {
    int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
 }
public class FindRightInterval {
     public int[] findRightInterval(Interval[] intervals) {
    int n = intervals.length;
        List<int[]> startToIndex = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int[] a = new int[2];
            a[0] = intervals[i].start;
            a[1] = i;
            startToIndex.add(a);
        }
        
        Collections.sort(startToIndex, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            } 
        });
        
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = search(startToIndex, intervals[i].end);
        }
        
        return res;
    }
    
    public int search(List<int[]> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (target > nums.get(mid)[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (left < 0 || left >= nums.size()) ? -1 : nums.get(left)[1];
    }

}
