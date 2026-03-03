
import java.util.*;

public class Q1 {

    
    public static void main(String[] args) {
        
        int[] q = {0,0,0 };
        int k = 1;

        Arrays.sort(q);

        int start = 0;
        int end = q.length-1;
        
        int sum = Integer.MIN_VALUE;

        while( start < end ){

            int mid = start + end/2;
            int midVal =  q[mid];
            int curr = q[start] + q[end] + midVal;

            if( sum > k ) {
                sum = Math.min(sum, curr);
            }
            else{
                sum = Math.max(sum, curr);
            }

            if( curr == k ) {
                System.out.println(curr);
                return;
            }

            else if( curr > k ){
                end  = mid;
            }
            else{
                start = mid;
            }

        }
        System.out.println(sum);


    }

}

//  1. Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target. 

// Return the sum of the three integers.

//  You may assume that each input would have exactly one solution. 

// Example 1: Input: nums = [-1,2,1,-4], target = 1 
// Output: 2 
// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2). 

// Example 2: Input: nums = [0,0,0], target = 1 
// Output: 0 
// Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0). 
// Constraints: 3 <= nums.length <= 500 -1000 <= nums[i] <= 1000 -10^4 <= target <= 10^4


