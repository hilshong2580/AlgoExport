import java.util.*;


/*
*
* TYou're looking to move into a new apartment on specific street, and you're given a list of contiguous
* blocks on that street where each block contains an apartment that you could move into.
*
* You also have a list of requirements: a list of buildings that are important to you. For instance, you might
* value having a school and a gym near your apartment. The list of blocks that you have contains information at
* every block about all of the buildings that are present and absent at the block in question. For instance,
* for every block, you might know whether a school, a pool, an office, and a gym are present.
*
*
* */



public class Arrays_ApartmentHunting {
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {
        Boolean[] checks = new Boolean[reqs.length];
        Boolean allTrue = true;
        int count = Integer.MAX_VALUE, index = -1;
        int shortestPath = Integer.MAX_VALUE;

        for(int i = 0; i < blocks.size(); i++)
        {
            for(int x = 0; x < checks.length; x++)
                checks[x] = false;
            count = Integer.MAX_VALUE;

            for(int j = i; j < blocks.size(); j++)
            {
                allTrue = true;

                for(int k = 0; k <reqs.length; k++)
                    if(blocks.get(j).get(reqs[k]) == true)
                        checks[k]=true;

                for(Boolean see: checks)
                    if(see == false)
                        allTrue = false;

                if(allTrue == true)
                {
                    count = j-i;
                    break;
                }
            }

            if(shortestPath > count){
                shortestPath = count;
                index = i+count/2;
            }
        }
        return index;
    }

}
