import java.util.*;
import java.util.Collections;

public class Greedy_TandemBicycle {
    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);



        int count = 0;
        for(int i = 0; i < redShirtSpeeds.length; i++){
            if(fastest)
                count += Math.max(redShirtSpeeds[i], blueShirtSpeeds[redShirtSpeeds.length -1 -i]);
            else
                count += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return count;
    }

}
