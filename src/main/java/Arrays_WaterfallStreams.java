import java.util.*;

public class Arrays_WaterfallStreams {
    public double[] waterfallStreams(double[][] array, int source) {
        double[] rowArray = array[0];
        rowArray[source] = -1;

        for(int i = 1; i < array.length; i++){
            double[] current = array[i];
            for(int j = 0; j < rowArray.length; j++){
                double check = rowArray[j];
                if(check < 0){

                    if(current[j]-1 < 0){
                        current[j] += check;
                    }else{

                        //check left
                        int x = j;
                        while(current[x] -1 >= 0){
                            x--;
                            if(x < 0 || rowArray[x] ==1)
                                break;
                            if(current[x]-1 < 0 )
                                current[x] += check/2;
                        }

                        //check right
                        int y = j;
                        while(current[y] -1 >= 0){
                            y++;
                            if(y==current.length || rowArray[y] ==1)
                                break;
                            if(current[y]-1 < 0)
                                current[y] += check/2;
                        }
                    }
                }
            }
            //System.out.println(" ");
            //for(double see: current)
            //System.out.print(see+" ");
            rowArray = current;
        }
        for(int k = 0; k< rowArray.length; k++)
            if(rowArray[k] < 0)
                rowArray[k]=rowArray[k]*(-100);

        return rowArray;
    }
}
