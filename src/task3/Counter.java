package task3;

/**
 *
 * @author tacita
 */
public class Counter {
/**
 * The logic behind the method is as following
 * 1)take initial buffer cell and set the value to {@code true} 
 * 2)shift position to right till we find a current cell with the value true 
 * 3)change value at current cell with false
 * 4)shift positions to left as many times as we passed right in second step and get to initial buffer cell
 * 5)check initial buffer cell value. If it's changed its value (after step 3) to  {@code false}
 * then buffer size is amount of shifts we've passed in step 2
 * if not repeat steps 2)-5)
 * @param buffer
 * @return buffer size
 */
    public static int countCells(BlackBoxCircularBuffer buffer) {
        int amount = 0;
        if (buffer.getCurrent() == false) {
            buffer.setCurrent(true);
        }
        for (;;) {
            amount = 1;
            for (;; amount++) {
                buffer.shiftPositionToRight();
                if (buffer.getCurrent()) {
                    break;
                }

            }
            buffer.setCurrent(false);
            for (int i = 1; i <= amount; i++) {
                buffer.shiftPositionToLeft();
            }
            if (!buffer.getCurrent()) {
                break;
            }
        }
        return amount;
    }
}
