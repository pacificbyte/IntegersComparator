package code.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class IntegersComparator {

    public Integer[] generateIntegersArray(int size, int min, int max) {
        Integer[] integers = new Integer[size];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }

        return integers;
    }

    public Boolean checkDuplicates(Integer[] integers) {
        Set<Integer> integersSet = new HashSet<Integer>(Arrays.asList(integers));
        if (integersSet.size() != integers.length) {
            System.out.println("There are duplicates!");
            return true;
        }

        return false;
    }

    public void printDuplicates(Integer[] integers) {
        System.out.println("The repeating elements are : ");
        Map<Integer, Integer> integerCount = new HashMap<>();
        
        
        for(Integer integer : integers) {
            Integer count = integerCount.get(integer);
            
            if(count == null) {
                integerCount.put(integer, 1);
            }
            else {
                integerCount.put(integer, count + 1);
            }
        }
        
        Set<Entry<Integer, Integer>> entrySet = integerCount.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }

    public void printIntersectedIntegers(Integer[] integers1, Integer[] integers2) {
        Set<Integer> integersSet1 = new HashSet<Integer>(Arrays.asList(integers1));
        Set<Integer> integersSet2 = new HashSet<Integer>(Arrays.asList(integers2));
        integersSet1.retainAll(integersSet2);

        List<Integer> sortedList = new ArrayList<>(integersSet1);
        Collections.sort(sortedList);

        System.out.println(sortedList.toString());
    }
}
