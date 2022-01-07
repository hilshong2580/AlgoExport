
import java.util.*;

public class Arrays_NonConstructibleChange {
    private int[] coins;

    public Arrays_NonConstructibleChange(int[] coins){
        this.coins = coins;
    }

    public int nonConstructibleChange() {
        Arrays.sort(coins);

        int change = 0;

        if(coins.length == 0)
            return 1;

        for(int coin : coins)
            if(coin > change + 1)
                return change + 1;
            else
                change +=coin;

        return change+1;
    }


}
