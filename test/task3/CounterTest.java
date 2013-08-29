package task3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tacita
 */
public class CounterTest {
    
    BlackBoxExposed blackBoxExposed;


    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_12() {
        blackBoxExposed= new BlackBoxExposed(12);
        int expResult = 12;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_123() {
        blackBoxExposed= new BlackBoxExposed(123);
        int expResult = 123;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
    

    
    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_5() {
        blackBoxExposed= new BlackBoxExposed(5);
        int expResult = 5;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_545999() {
        blackBoxExposed= new BlackBoxExposed(545);
        int expResult = 545;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_1() {
        blackBoxExposed= new BlackBoxExposed(1);
        int expResult = 1;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_9999() {
        blackBoxExposed= new BlackBoxExposed(9999);
        int expResult = 9999;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of countCells method, of class Counter.
     */
    @Test
    public void testCountCells_12000() {
        blackBoxExposed= new BlackBoxExposed(12000);
        int expResult = 12000;
        int result = Counter.countCells(blackBoxExposed);
        assertEquals(expResult, result);
    }
}