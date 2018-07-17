package code.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IntegersComparatorTest
{
    IntegersComparator iComparator;
    Integer[] integers;
    
    @Before
    public void init() {
        iComparator = new IntegersComparator();
    }

    @Test
    public void generateIntegersArray_1000() {
        int expectedSize = 1000;
        integers = iComparator.generateIntegersArray(1000, 1, 1000);
        assertEquals(expectedSize, integers.length);
    }
    
    @Test
    public void checkDuplicates_true() {
        integers = iComparator.generateIntegersArray(1000, 1, 1000);
        Boolean isThereDuplicates = iComparator.checkDuplicates(integers);
        assertTrue(isThereDuplicates);
    }
    
    @Test
    public void checkDuplicates_false() {
        integers = iComparator.generateIntegersArray(1, 1, 1000);
        Boolean isThereDuplicates = iComparator.checkDuplicates(integers);
        assertFalse(isThereDuplicates);
    }
    
    @Test
    public void printDuplicates() {
        integers = iComparator.generateIntegersArray(10, 1, 10);
//        Integer[] ints = new Integer[] {10,10,10};
        iComparator.printDuplicates(integers);
    }
    
    @Test
    public void printIntersectedIntegers() {
        integers = iComparator.generateIntegersArray(1000, 1, 1000);
        Integer[] integers2 = iComparator.generateIntegersArray(1000, 1, 1000);
        iComparator.printIntersectedIntegers(integers, integers2);
    }
}
