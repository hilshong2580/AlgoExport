import java.util.List;

class Arrays_ValidateSubsequence {
    private List<Integer> array;
    private List<Integer> sequence;

    public Arrays_ValidateSubsequence(List<Integer> array, List<Integer> sequence){
        this.array = array;
        this.sequence = sequence;
    }

    public boolean isValidSubsequence(){
        int count = 0, j = 0;

        for(int i=0; i < array.size(); i++){
            if (array.get(i) == sequence.get(j)){
                count++;
                j++; }

            if(count == sequence.size())
                return true;
        }
        return false;
    }
}
