class Solution 
{
    List<List<Integer>> resultSet = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        backtrack(candidates, new ArrayList<>(), target, 0);
        return resultSet;
    }
    private void backtrack(int[] candidates, List<Integer> currentPath, int remainingTarget, int start){
        if(remainingTarget < 0){
            return;
        }
        if (remainingTarget == 0) {
            resultSet.add(new ArrayList<>(currentPath)); 
            return;
        }
        
        for ( int i = start ; i <  candidates.length; i++){
            currentPath.add(candidates[i]);
            backtrack(candidates , currentPath , remainingTarget - candidates[i], i);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}