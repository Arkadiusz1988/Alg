package com.company.Algoritm_3Sum;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionThreeSum {


    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> threeS = new ArrayList<>();

        Arrays.sort(nums); // entered list sorted

        for(int i =0; i<=nums.length; i++){
            for (int j = (i+1); j < nums.length; j++) {
                for (int k = (j+1); k <nums.length ; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        threeS.add(Arrays.asList(nums[i],nums[j],nums[k])); // arrays list added to threeS list, list included a duplicates
                    }
                }
            }
        }
        List<List<Integer>> listWithoutDuplicates = threeS.stream().distinct()
                .collect(Collectors.toList());                                // using stream api to remove duplicates

       return listWithoutDuplicates;
    }
}
