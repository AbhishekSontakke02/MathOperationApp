package com.bl.java.functional_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlayList {
    public static void main(String[] args) {

        List<Integer> myNumberList = new ArrayList<>();
        for (int i=0; i<=5;i++) myNumberList.add(i);

        //Method 1 : Traversing using Iterator
        Iterator<Integer> it = myNumberList.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value: "+i);
        }

        //Method 2 : Traversing with Consumer interface Implementation
        class MyConsumer implements Consumer<Integer>{
            @Override
            public void accept(Integer t) {
                System.out.println("Mth2: Consumer impl Value : "+t);
            }
        }

        MyConsumer action = new MyConsumer();
        myNumberList.forEach(action);

        //Method 3: Traversing with Anonymous Consumer interface implementation
        myNumberList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Mth3: forEach Anonymous class value : "+t);
            }
        });

        // Method 4: Explicit Lambda Function
        Consumer<Integer> myListAction = n ->{
            System.out.println("Mth4 : forEach Lambda impl Value : "+ n);
        };
        myNumberList.forEach(myListAction);
        //Method 5 : Implicit Lambda Function
        myNumberList.forEach(n->{
            System.out.println("Mth5 : forEach Lambda impl Value : "+n);
        });

        // Method 6 : Implicit Lambada Function To print Double Value
        Function<Integer,Double> toDoubleFunction = Integer :: doubleValue;
        myNumberList.forEach(n->{
            System.out.println("Mth6: forEach Lambda impl Value : "+ toDoubleFunction.apply(n));
        });
    }
}
