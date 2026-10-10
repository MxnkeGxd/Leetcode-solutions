
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        ArrayList<int[]> arr=new ArrayList<>();
        for(int num:hm.keySet()){
            arr.add(new int[]{hm.get(num),num});
        }
        Collections.sort(arr,(a,b)->b[0]-a[0]);
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}