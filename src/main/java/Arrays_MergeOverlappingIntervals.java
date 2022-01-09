import java.util.*;

public class Arrays_MergeOverlappingIntervals {

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        int loop = 0, h = 0, k = 1;

        for (int[] i : intervals)
            treeMap.put(i[0], i[1]);

        while (loop != intervals.length - 1) {
            if (treeMap.get(intervals[h][0]) >= intervals[k][0]) {
                treeMap.put(intervals[h][0], treeMap.get(intervals[k][0]));
                treeMap.remove(intervals[k][0]);
                k++;
            } else {
                h = k;
                k++;
            }
            loop++;
        }

        int[][] result = new int[treeMap.size()][2];
        loop = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            result[loop][0] = entry.getKey();
            result[loop][1] = entry.getValue();
            loop++;
        }

        return result;
    }
}

