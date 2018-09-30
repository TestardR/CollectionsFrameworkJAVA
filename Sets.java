package com.romaintestard;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args){
        // LinkedHash - order that they were entered
        // HashSet - complete random order
        // TreeSet - rearranges to alphabetical order
        // => Import respective libraries

        // 1. Define the collection
        Set<String> animals = new HashSet<String>();

        // 2. Adding elements
        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("snake");

        System.out.println(animals + " " + animals.size());

        animals.add("goose");
        animals.add("cat"); // it does not take duplicates
        animals.add("panther");

        System.out.println(animals + " " + animals.size());

        // 3. Create a new set that we use for comparison
        Set<String> farmAnimals = new HashSet<String>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        // What is the INTERSERCTION between animals and farm animals
        // 1. Copy existing set into a new set
        Set<String> intresectionSet = new HashSet<String>(animals);
        System.out.println(intresectionSet);
        // 2. Retain ONLY the elements that are also in the other set
        intresectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is: " + intresectionSet);

        // What is the UNION
        Set<String> unionSet = new HashSet<String>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        // What is the DIFFERENCE
        Set<String> differenceSet = new HashSet<String>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is " + differenceSet);

    }
}
