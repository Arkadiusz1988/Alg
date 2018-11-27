package com.company;

public class SolutionTwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int [] tmp1= new int[2];
        for(int i =0; i<=nums.length; i++){
            for (int j = (i+1); j < nums.length; j++) {
                int tmpi=nums[i];
                int tmpj=nums[j];
                if((tmpi+tmpj)==target){
                    int[] tmp = {i,j};
                    return tmp;// array with indices of the two numbers such that they add up to a specific target
                }
            }
        }
        return tmp1;// zero array if input numbers cannot achieve targer
    }
}
