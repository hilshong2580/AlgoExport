import java.util.*;

public class Arrays_LineThroughPoints {

    public int lineThroughPoints(int[][] points) {
        Map<Double, Integer> myMap = new HashMap<Double, Integer>();
        int max = 1;

        for(int i = 0; i < points.length; i++){
            Double x1 = Double.valueOf(points[i][0]);
            Double y1 = Double.valueOf(points[i][1]);
            for(int j = i+1; j < points.length; j++){
                Double x2 = Double.valueOf(points[j][0]);
                Double y2 = Double.valueOf(points[j][1]);
                Double slope = Double.valueOf((y2-y1)/(x2-x1));
                if(myMap.containsKey(slope))
                    myMap.put(slope, myMap.get(slope)+1);
                else
                    myMap.put(slope, 2);

                if(max <myMap.get(slope))
                    max = myMap.get(slope);
            }
            myMap = new HashMap<Double, Integer>();
        }
        return max;
    }
}
