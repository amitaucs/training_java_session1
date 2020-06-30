package com.amisoft;

import java.util.stream.IntStream;

public class SumOfNumber {

    public static void main(String[] args) {

        // sum of integers for the range from 0 to 200

        //Imperative style

        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum is : "+sum);


       //Declarative style

        int sum1= IntStream.rangeClosed(0,100)
                //.parallel()
                .map(Integer::new)
                .sum();

        System.out.println("sum1 : " + sum1);

    }
}
