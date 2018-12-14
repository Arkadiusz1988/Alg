package com.company.Algorithm_Median_of_Two_Sorted_Arrays;


import java.util.Arrays;

import static com.company.Algorithm_Median_of_Two_Sorted_Arrays.SecondSolution.findMed;
import static com.company.Algorithm_Median_of_Two_Sorted_Arrays.SolutionMedianSortedArrays.findMedianSortedArrays;

public class Main {

    public static void main(String[] args) {
        int[] tmp1 = {1,2};
        int[] tmp2 = {3,4};
         Arrays.sort(tmp1);
         Arrays.sort(tmp2);

        System.out.println(findMed(tmp1,tmp2));

    }
}
