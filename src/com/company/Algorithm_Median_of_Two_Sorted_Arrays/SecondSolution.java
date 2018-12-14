package com.company.Algorithm_Median_of_Two_Sorted_Arrays;

import java.util.Arrays;

// second solution with run time about 40ms(tables instead of stream and list )

public class SecondSolution {

    public static double findMed(int[] nums1, int[] nums2) {


        int[] array = new int[nums1.length+nums2.length];

        for (int i =0; i < nums1.length; i++) {
            array[i]=nums1[i];
        }

        for (int i =nums1.length; i < (nums2.length +nums1.length); i++) {
            array[i]=nums2[i-nums1.length];  // put two int tables onto one
        }

        Arrays.sort(array);

        double MP1 = 0;
        if(array.length%2==0){
            double tmp = array[(array.length-1)/2];
            double tmp1 = array[array.length/2]; // condition for even and odd int
            MP1 = ( tmp + tmp1)/2;
        }
        if(!(array.length%2==0)){
            MP1 = (array[array.length/2]);
        }

        return MP1;
    }
}
