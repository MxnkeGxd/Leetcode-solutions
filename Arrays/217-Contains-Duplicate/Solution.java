class Solution {
    public boolean containsDuplicate(int[] nums){
       HashSet<Integer> cc = new HashSet();
       for(int i = 0 ; i < nums.length ; i++){
            int curr = nums[i];
            
            if(cc.contains(curr)){
                return true;
            }
            cc.add(curr);
        }

        return false;
    }
    public static void main(String[] args){
        
    }
}