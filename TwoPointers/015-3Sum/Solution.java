import java.util.*;
class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) 
        {
            
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            
            if (nums[i] > 0)
                break;

            int L = i + 1;
            int R = nums.length - 1;  

            while (L < R) 
            {
                int sum = nums[i] + nums[L] + nums[R];

                if (sum == 0) 
                {
                    List<Integer> ar = new ArrayList<>();

                    ar.add(nums[i]);
                    ar.add(nums[L]);
                    ar.add(nums[R]);

                    res.add(ar);

                    // Skip duplicate left values
                    while (L < R && nums[L] == nums[L + 1])
                        L++;

                    // Skip duplicate right values
                    while (L < R && nums[R] == nums[R - 1])
                        R--;

                    L++;
                    R--;
                }
                else if (sum < 0) 
                {
                    L++;
                }
                else 
                {
                    R--;
                }
            }
        }

        return res;
    }
}