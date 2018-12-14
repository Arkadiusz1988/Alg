package com.company.Algorithm_Median_of_Two_Sorted_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> array = new ArrayList<>();

        for (int i =0; i < nums1.length; i++) {
        array.add(nums1[i]);
        }

        for (int i =0; i < nums2.length; i++) {
            array.add(nums2[i]);  // put two int tables to one list
        }

        List<Integer> sortedArray =  array.stream().sorted().collect(Collectors.toList()); // sort that list

        double MP1 = 0;
        if(sortedArray.size()%2==0){
            double tmp = sortedArray.get((sortedArray.size()-1)/2); // condition for median algorithms, even and odd size
            double tmp1 = sortedArray.get((sortedArray.size())/2);
          MP1 = ( tmp + tmp1)/2;
        }
        if(!(sortedArray.size()%2==0)){
            MP1 = sortedArray.get((sortedArray.size())/2);
        }

        return MP1;
    }
}
