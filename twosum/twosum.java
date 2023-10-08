package twosum;

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        int[] ans = solution(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] solution(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    int complement = target - nums[i];
                    if(complement == nums[j])
                    {
                        return new int[] {i,j};
                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
}
