/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


/*
Sort the given meetings by their start time.
Initialize a new min-heap and add the first meeting's ending time to the heap.
We simply need to keep track of the ending times 
as that tells us when a meeting room will get free.
For every meeting room check if the minimum element of the heap 
i.e. the room at the top of the heap is free or not.
If the room is free, then we extract the topmost element and add it back 
with the ending time of the current meeting we are processing.
If not, then we allocate a new room and add it to the heap.
After processing all the meetings, 
the size of the heap will tell us the number of rooms allocated. 
This will be the minimum number of rooms needed to accommodate all the meetings.
Time Complexity: O(NlogN).
Space Complexity: O(N).
*/

class Intervals{
    int start, end;
    Intervals(){
        start = 0;
        end = 0;
    }
    Intervals(int s, int e){
        start = s;
        end = e;
    }
}


public class MeetingRoomsII {
    public static int minMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0){
            return 0;
        }
        
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start-i2.start;
            }
        });
        //take pq to manage min values
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int count = 1;
        //add the first meeting
        queue.offer(intervals[0].end);
        for(int index = 1; index< intervals.length; index++){
            Interval current = intervals[index];
            if(current.start >= queue.peek()){
                queue.remove();
            }
              queue.add(current.end);
            
   
        }
        return queue.size();
    
    }
    /*using hash map
    public int minMeetingRooms(Interval[] intervals) {  
        Map<Integer, Integer> m = new TreeMap(); // we must use a sorted map
        for (Interval i : intervals) {
            m.put(i.start, m.getOrDefault(i.start, 0) + 1);
            m.put(i.end, m.getOrDefault(i.end, 0) - 1);
        }
        int curRooms = 0, maxRooms = 0;
        for (Integer time : m.keySet()) {
            maxRooms = Math.max(maxRooms, curRooms += m.get(time));
        }
        return maxRooms;
    }  
    */
    public static void main(String[]args){
        Intervals [] arr = {{0,30}, {5,10},{15,20}};
        
    }
    
}
