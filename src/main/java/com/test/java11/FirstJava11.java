package com.test.java11;

import java.util.*;
import java.util.stream.Collectors;

public class FirstJava11 {

    public static void main(String[] args) {
        System.out.println("This is Java11 Program");

        Set set1 = new HashSet();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");

        set1.stream().forEach(a->System.out.println(a=a+"add"));


        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(10);
        l.add(15);
        l.add(20);
        List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println((l2));


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Prabhas");
        arrayList.add("Shilpa Shetty");
        arrayList.add("Kaja Agarwal");
        arrayList.add("Anushka Shetty");
        arrayList.add("Sharukh Khan");
        System.out.println(arrayList);
        Comparator<String> c = (s1, s2) -> {
            int l1 = s1.length();
            int p2= s2.length();
            if(l1<p2) return -1;
            else if(l1>p2) return 1;
            else return s1.compareTo(s2);
        };
        List<String> sortedList= arrayList.stream().sorted((s1,s2)->((s1.length()<s2.length()?-1:s1.length()>s2.length()?1:0))).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
