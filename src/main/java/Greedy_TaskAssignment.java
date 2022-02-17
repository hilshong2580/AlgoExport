import java.util.*;
public class Greedy_TaskAssignment {
    public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < tasks.size(); i++){
            if(!map.containsKey(tasks.get(i)))
                map.put(tasks.get(i), new ArrayList<Integer>());
            ArrayList<Integer> temp = map.get(tasks.get(i));
            temp.add(i);
            map.put(tasks.get(i), map.get(tasks.get(i)));
        }
        Collections.sort(tasks);

        for(int i = 0; i < tasks.size()/2; i++){
            list.add(new ArrayList<Integer>());
            list.get(i).add(map.get(tasks.get(i)).remove(0));
            list.get(i).add(map.get(tasks.get(tasks.size()-1-i)).remove(0));
        }
        return list;
    }

}
