package edu.northeastern.fxmy;

public class question2 {

    public static void main(String[] args) {

        int[] nums = {3, 0, 1};
        System.out.println(question2(nums));
    }

    //Time: O(n) Space: O(1)
    public static int question2(int[] nums){
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }

        int summax = ((1+nums.length)*nums.length)/2;
        return summax-sum;
    }
}
