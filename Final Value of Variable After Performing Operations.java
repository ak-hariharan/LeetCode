class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for(int i = 0; i < operations.length; i += 1){
            if(operations[i].equals("X++"))
                x +=1;
            else if(operations[i].equals("++X"))
                x += 1;
            else if(operations[i].equals("--X"))
                x -= 1;
            else if(operations[i].equals("X--"))
                x -= 1;
        }
        return x;
    }
}
