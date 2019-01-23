package com.company.Algorithm_Smallest_positive_integer;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    public static int solution(int[] A) {

    Arrays.sort(A);

    List newList = new ArrayList();
    for (int i = 0; i <A.length ; i++) {
        newList.add(A[i]);
    }


    ArrayList listWithoutDuplicates = (ArrayList) newList.stream().distinct()
                .collect(Collectors.toList());

    for (int i = 0; i < listWithoutDuplicates.size()-1; i++) {

                if(!(((int)listWithoutDuplicates.get(i)+1)==((int)listWithoutDuplicates.get(i+1)))){
                    if((int)listWithoutDuplicates.get(i+1)>0){
                        if((int)listWithoutDuplicates.get(i)+1==0){
                            return 1;
                        }
                        return (int)listWithoutDuplicates.get(i)+1;
                    } else return 1;
                }

        }

    return listWithoutDuplicates.size()+1;
    }
}
