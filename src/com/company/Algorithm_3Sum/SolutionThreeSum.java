package com.company.Algorithm_3Sum;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionThreeSum {


    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> threeS = new ArrayList<>();
      //  Set<List<Integer>> noDups = new HashSet<>();

        Arrays.sort(nums); // entered list sorted

        for(int i =0; i<nums.length; i++){
            for (int j = (i+1); j < nums.length; j++) {
                for (int k = (j+1); k <nums.length ; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        threeS.add(Arrays.asList(nums[i],nums[j],nums[k])); // arrays list added to threeS list, list included a duplicates
                        int size = threeS.size();
                        if (size>=2){
                            if (threeS.get(size-2).containsAll(threeS.get(size - 1))) {
                                threeS.remove(size-2);
                                size--;
                            }
                        }
                      //  noDups.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }

        int tmp1 = threeS.size();
        System.out.println(tmp1);
//
        List<List<Integer>> listWithoutDuplicates = threeS.stream().distinct()
                .collect(Collectors.toList()); // using stream api to remove duplicates
//
        int tmp = listWithoutDuplicates.size();
        System.out.println(tmp);

       // new ArrayList<>(noDups)
        return listWithoutDuplicates;
    }
}
