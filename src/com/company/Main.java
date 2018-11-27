package com.company;

import java.util.Arrays;
import static com.company.SolutionTwoSum.twoSum;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3,2,4,7,8,9};
        int target = 16;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
