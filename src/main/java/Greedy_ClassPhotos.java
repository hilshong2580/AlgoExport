import java.util.*;

public class Greedy_ClassPhotos {
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
        ArrayList<Integer> larger = new ArrayList<>();
        ArrayList<Integer> smaller = new ArrayList<>();

        if(redShirtHeights.get(0) > blueShirtHeights.get(0)){
            larger = redShirtHeights;
            smaller = blueShirtHeights;
        } else{
            larger = blueShirtHeights;
            smaller = redShirtHeights;
        }

        for(int i = 0; i < redShirtHeights.size(); i++){

            if(larger.get(i) <= smaller.get(i))
                return false;
        }
        return true;
    }
}
