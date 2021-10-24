package edu.northeastern.fxmy;

public class question1 {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        question1(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }

    //Time: O(n) Space: O(1)
    public static void question1(int[] nums){
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        while(index<nums.length){
            nums[index] = 0;
            index++;
        }
    }
}
