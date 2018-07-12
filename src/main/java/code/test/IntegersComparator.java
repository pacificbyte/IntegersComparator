package code.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class IntegersComparator {

    public Integer[] generateIntegersArray(int size, int min, int max) {
        Integer[] integers = new Integer[size];
        
        for(int i = 0; i < integers.length; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        
        return integers;
    }
    
    public Boolean checkDuplicates(Integer[] integers) {
        Set<Integer> integersSet = new HashSet<Integer>(Arrays.asList(integers));
        if(integersSet.size() != integers.length) {
            System.out.println("There are duplicates!");
            return true;
        }
        
        return false;
    }
    
    public void printDuplicates(Integer[] integers) {
        Set<Integer> integersSet = new HashSet<Integer>(Arrays.asList(integers));
        System.out.println("The repeating elements are : ");
    
        for(int i : integers) {
            if ( ! integersSet.add(i) ) { 
                System.out.println(i);
            }
        }
    }
    
    public void printIntersectedIntegers(Integer[] integers1, Integer[] integers2) {
        Set<Integer> integersSet1 = new HashSet<Integer>(Arrays.asList(integers1));
        Set<Integer> integersSet2 = new HashSet<Integer>(Arrays.asList(integers2));
        integersSet1.retainAll(integersSet2);

        List sortedList = new ArrayList(integersSet1);
        Collections.sort(sortedList);
        
        System.out.println(sortedList.toString());
    }
}
