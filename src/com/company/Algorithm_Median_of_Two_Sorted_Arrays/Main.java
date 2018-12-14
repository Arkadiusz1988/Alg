package com.company.Algorithm_Median_of_Two_Sorted_Arrays;


import java.util.Arrays;

import static com.company.Algorithm_Median_of_Two_Sorted_Arrays.SolutionMedianSortedArrays.findMedianSortedArrays;

public class Main {

    public static void main(String[] args) {
        int[] tmp1 = {3};
        int[] tmp2 = {-2,-1};
         Arrays.sort(tmp1);
         Arrays.sort(tmp2);

        System.out.println(findMedianSortedArrays(tmp1,tmp2));

        //System.out.println(tmp1.length);
        //System.out.println(tmp1.length / 2);

    }
}
