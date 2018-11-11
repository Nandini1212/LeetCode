/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
class Interv {
      int start;
      int end;
      Interv() { start = 0; end = 0; }
      Interv(int s, int e) { 
          start = s; 
          end = e;
      }
  }
public class MeetingRoom1CanAttendOrNOt {
    public boolean canAttendMeetings(Interv[] intervals){
        if(intervals == null || intervals.length < 2){
            return true;
        }
        int len = intervals.length;
        Arrays.sort(intervals, new Comparator<Interv>(){
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        for(int i = 1; i < len; i++){
            if(intervals[i].start < intervals[i - 1].end){
                return true;
            }
        
        }
    }
}
