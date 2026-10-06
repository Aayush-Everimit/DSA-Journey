class Solution 
{
    public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    backtrack(n, 0, 0, new StringBuilder(), result);
    return result;
}
private void backtrack(int max , int open , int close , StringBuilder current, List<String> result){
    if(current.length() == max*2){
        result.add(current.toString());
        return;
    }
    if(open<max){
        current.append("(");
        backtrack(max, open+1, close, current, result);
        current.deleteCharAt(current.length() - 1);
    }
    if(close< open){
        current.append(")");
        backtrack(max, open, close+1, current, result);
        current.deleteCharAt(current.length() - 1);
    }}
}