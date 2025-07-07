class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        recursion(n,n,"", ans);
        return ans;
    }

    public void recursion(int open,int close, String currString,List<String> ans){
        if(open == 0 && close == 0){
            ans.add(currString);
        }
        // for opening bracket
        if(open >0){
            recursion(open -1, close, currString + '(', ans);
        }
        // for closing bracket
        if(open < close){
            recursion(open, close -1,currString + ')', ans);
        }
    }
}