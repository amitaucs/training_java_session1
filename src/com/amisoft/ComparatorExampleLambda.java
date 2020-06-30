package com.amisoft;

import java.util.Comparator;

public class ComparatorExampleLambda {

    public static void main(String[] args) {

        //Without Lambda

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0-> o1=o1, 1 -> o1 > o2, -1 -> o1 < o2
            }
        };

        System.out.println("Result of comparison without lambda is : " + comparator.compare(4,5));


        //With Lambda

        Comparator<Integer> integerComparator = (a,b) -> a.compareTo(b);
        System.out.println("Result of comparison with lambda is : " + integerComparator.compare(4,5));



    }
}
