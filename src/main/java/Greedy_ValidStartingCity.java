import java.util.*;

public class Greedy_ValidStartingCity {
    public int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int current = 0, minimum = Integer.MAX_VALUE, city = 0;

        for(int i = 0; i < distances.length; i++){
            current = current + (fuel[i] * mpg - distances[i]);
            if(current < minimum){
                minimum = current;
                city = i;
            }
        }
        return (city+1) % (distances.length);
    }
}
