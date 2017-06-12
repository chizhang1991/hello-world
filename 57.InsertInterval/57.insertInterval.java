/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> res = new ArrayList<Interval>();
        
        if(intervals == null || intervals.size() == 0) {
            res.add(newInterval);
            return res;
        }
        
        intervals.add(newInterval);
        Collections.sort(intervals, new IntervalComparator());
        
        int j = 0;
        res.add(intervals.get(j));
        int size = intervals.size();
        for(int i = 1; i < size; i++) {
            if(res.get(j).end >= intervals.get(i).start) {
                res.set(j, new Interval(res.get(j).start, Math.max(intervals.get(i).end, res.get(j).end)));
            }
            else {
                j++;
                res.add(intervals.get(i));
            }
        }
        return res;
    }
    
    class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval l1, Interval l2) {
            return l1.start - l2.start;
        }
    }
}