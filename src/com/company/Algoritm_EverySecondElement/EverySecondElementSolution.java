package com.company.Algoritm_EverySecondElement;

public class EverySecondElementSolution {

    public static int[] everySecondElementofTable(int[] entryTab){

        if(entryTab.length%2==0){

            int[] secondTab = new int[(entryTab.length / 2)];
            int count = 0;

            for (int i = 0; i < entryTab.length ; i++) {
                if(i%2==0){
                  secondTab[count] = entryTab[i];
                  count++;
                }
            }
        return secondTab;

     } else {
            int[] secondTab = new int[(entryTab.length / 2)+1];
            int count = 0;

            for (int i = 0; i < entryTab.length ; i++) {
                if(i%2==0){
                    secondTab[count] = entryTab[i];
                    count++;
                }
            }
       return secondTab;
         }
    }
}


