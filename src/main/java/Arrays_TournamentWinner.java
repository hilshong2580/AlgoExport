import java.util.*;

public class Arrays_TournamentWinner {
    private ArrayList<ArrayList<String>> competitions;
    private ArrayList<Integer> results;

    public Arrays_TournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        this.competitions = competitions;
        this.results = results;
    }

    public String tournamentWinner() {
        int HOME_TEAM = 1;
        String curBest = "";
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put(curBest, 0);

        for(int i = 0; i < competitions.size(); i++)
        {
            ArrayList<String> competition = competitions.get(i);
            int result =results.get(i);

            String home = competition.get(0);
            String away = competition.get(1);

            String winning = (result == HOME_TEAM) ? home : away;

            updateScore(winning, 3, scores);

            if(scores.get(winning)> scores.get(curBest)){
                curBest = winning;
            }
        }

        return curBest;
    }

    public void updateScore(String team, int points, HashMap<String, Integer> scores){
        if(!scores.containsKey(team)){
            scores.put(team, 0);
        }
        scores.put(team, scores.get(team) +points);
    }


}
