class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int longest=0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int n=num;
                int len=1;
                while(hs.contains(n+1)){
                    len++;
                    n++; 
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}