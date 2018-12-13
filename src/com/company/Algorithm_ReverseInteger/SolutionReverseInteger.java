package com.company.Algorithm_ReverseInteger;

public class SolutionReverseInteger {

    public static int reverse(int x) {

        if(x==0 || x> Integer.MAX_VALUE || x<Integer.MIN_VALUE){ // check if entered int is in scopre or value is 0
            return 0;
        }
        Integer tmp = x;
        String tmpS = tmp.toString();
        StringBuilder tmpN = new StringBuilder(tmpS);
        StringBuilder tmpN1 = new StringBuilder();
        tmpN.reverse();


      if(tmpN.indexOf("-")==(tmpN.length()-1)){ // if entered int is minus then we create a new reversed string with minus in first sign
          tmpN.deleteCharAt(tmpN.length()-1);
          tmpN1.insert(0,"-");
          tmpN1.insert(1,tmpN);
          long i =  Long.valueOf(tmpN1.toString());
          if(i> Integer.MAX_VALUE || i<Integer.MIN_VALUE){ // check if reversed int is albo in int scope
              return 0;
          }
          return (int) i;
     }

        if(tmpN.indexOf("0")==(tmpN.length()-1)){
            tmpN.deleteCharAt(tmpN.length()-1);
        }
        long i =  Long.valueOf(tmpN.toString());

        if(i> Integer.MAX_VALUE || i<Integer.MIN_VALUE){ // check if reversed int is albo in int scope
            return 0;
        }
        return (int) i;
    }
}
