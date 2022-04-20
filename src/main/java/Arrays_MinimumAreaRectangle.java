import java.util.*;

public class Arrays_MinimumAreaRectangle {
    public int minimumAreaRectangle(int[][] points) {
        if(points.length < 4)
            return 0;

        int[][] getPoint = points;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer, int[]> myMap = new HashMap<Integer, int[]>();
        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> able = new ArrayList<Integer>();
        aList.add(getPoint[0][1]);
        int first = getPoint[0][0];
        int count = 1;

        for(int i = 1; i < getPoint.length; i++){
            if(first == getPoint[i][0]){
                count++;
                aList.add(getPoint[i][1]);

                if(i+1 == getPoint.length){
                    int[] temp = new int[aList.size()];
                    for(int j = 0; j<aList.size(); j++)
                        temp[j] = aList.get(j);
                    myMap.put(first, temp);
                    able.add(first);
                }
            }else{
                if(count > 1){
                    int[] temp = new int[aList.size()];
                    for(int j = 0; j<aList.size(); j++)
                        temp[j] = aList.get(j);
                    myMap.put(first, temp);
                    able.add(first);
                }

                aList = new ArrayList<Integer>();
                first = getPoint[i][0];
                count = 1;
                aList.add(getPoint[i][1]);
            }
        }

        count = Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i = 0; i < able.size(); i++){
            int[] temp = myMap.get(able.get(i));

            System.out.print(able.get(i)+": ");
            for(int x : temp)
                System.out.print(x+" ");

            System.out.println(" ");
            for(int j = 1; j < temp.length; j++){
                Boolean match_1 = false;
                Boolean match_2 = false;
                int aaa = temp[j-1];
                int bbb = temp[j];

                for(int h = i+1; h < able.size(); h++){
                    int[] temp2 = myMap.get(able.get(h));

                    for(int x : temp2){
                        if(x==aaa)
                            match_1 = true;
                        if(x==bbb)
                            match_2 = true;
                    }
                    if(match_1 && match_2){
                        int width = able.get(h) - able.get(i);
                        int height = Math.abs(aaa-bbb);
                        count = width*height;

                        if(mini > count)
                            mini = count;

                    }

                }

            }
        }
        if(mini == Integer.MAX_VALUE)
            return 0;

        return mini;
    }

}
