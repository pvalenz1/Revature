package com.revature.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

        /* ITERATOR
            Interface when implemented allows the implementation type to be the subject of a for each loop.
            All of these implement the Iterator interface,
            every collection has an iterator,
            allows traversal between elements and safe removal of elements in place.
         */

    public static void main(String[] args) {

        //create an arraylist
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("C");
        a1.add("D");
        a1.add("E");
        a1.add("A");
        a1.add("H");
        a1.add("B");
        a1.add("G");
        a1.add("F");

        //use iterator to display contents of a1
        System.out.println("Original contents a1:");
        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");

        }
        //modify elements being iterated
        ListIterator<String> litr = a1.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + " +");
        }

        System.out.println("\nModified contents of a1:");
        //resets the iterator to the beginning
        itr = a1.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");

        }
        //Display the list backwards
        System.out.println("\nModified list backwards");
        while(litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");

        }
        //For each loop is more convenient when not modifying or printing backwards

        System.out.println(" ");
        for (String s:a1) {
            System.out.println(s + " ");
        }
    }
}