package com.jie.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        ArrayList<String> arr  = new ArrayList();
        arr.add("aa");
        arr.add("bb");
        arr.add("cc");
        arr.add("dd");

        collection.addAll(arr);

        collection.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals("dd");
            }
        });

        System.out.println(collection);
    }
}
