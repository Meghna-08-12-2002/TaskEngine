package com.xworkz.person.runner;

import java.util.*;

public class LinkRunner {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(3);//new node(null,3,ref5)
        list.add(5);//new node(ref3,5,ref8)
        list.add(8);//new node(ref5,8,ref21)
        list.add(21);//new node(ref8,21,ref25)
        list.add(25);//new node(ref21,25,ref5)
        list.remove(2);
        System.out.println(list);


        List<Integer> arraylist=new ArrayList<>();
        arraylist.add(3);//[0]
        arraylist.add(4);//[1]
        arraylist.add(5);//[2]
        arraylist.add(89);//[3]
        arraylist.add(44);//[4]
        arraylist.add(32);//[5]
        arraylist.remove(5);
        List<Integer> subList = arraylist.subList(0, 2);
        System.out.println("SubList (0 to 2): " + subList);
        System.out.println("-------------------");

        Spliterator<Integer> spliterator= arraylist.spliterator();
        spliterator.forEachRemaining(System.out::println);
        System.out.println("-------------------");
        
        
        System.out.println(arraylist);

    }
}
