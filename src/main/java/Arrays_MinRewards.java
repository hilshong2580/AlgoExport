import java.util.*;

/*
Imagine that you're a teacher who's just graded the final exam in a class. You have a list of
student scores on the final exam in a particular order (not necessarily sorted), and you want
to reward your students. You decide to do so fairly by giving them arbitrary reward following rules:
1. All students must receive at least one reward.
2. Any given student must receive strictly more rewards than an adjacent student (a student immediately
to the left or to the right) with a lower score and must receive strictly fewer rewards than an adjacent
student with a higher score.

Write a function that takes in a list of scores and returns the minimum number of rewards that you must
give out to students to satisfy the two rules.

You can assume that all students have different scores; in other words, the scores are all unique.

input scores: [8, 4, 2, 1, 3, 6, 7, 9, 5]
output : 25

*/

public class Arrays_MinRewards {
    public static int minRewards(int[] scores) {

        Boolean check = true;
        int[] back = new int[scores.length];
        int j = 0;
        Map<Integer, Integer> mapList = new HashMap<Integer, Integer>();


        for(int i = 0; i < scores.length; i++)
            back[i] = 1;

        do{
            check = true;

            for(int i = 1; i < scores.length; i++){
                j = i-1;
                if(scores[j] > scores[i] && back[j] <= back[i]){
                    back[j] = back[i]+1;
                    check = false;
                }
            }

            for(int i = scores.length-1; i > 0; i--){
                j = i-1;
                if(scores[i] > scores[j] && back[i] <= back[j]){
                    back[i] = back[j]+1;
                    check = false;
                }
            }
            j = 0;
        }while(check==false);

        for(int i = 0; i < back.length; i++)
            j +=back[i];

        return j;
    }

}
