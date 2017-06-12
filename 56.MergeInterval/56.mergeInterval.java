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
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        
        List<Interval> res = new ArrayList<Interval>();
        
        Collections.sort(intervals, new IntervalComparator());
        
        int j = 0;
        res.add(intervals.get(j));
        int size = intervals.size();
        
        for(int i = 1; i < size; i++) {
            if(res.get(j).end >= intervals.get(i).start) {
                res.set(j, new Interval(res.get(j).start, Math.max(res.get(j).end, intervals.get(i).end)));
            }
            else {
                j++;
                res.add(intervals.get(i));
            }
        }
        return res;
    }
    class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }
}