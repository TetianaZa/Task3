package task3;

import java.util.Random;

/**
 *
 * @author tacita
 */
public class BlackBoxExposed implements BlackBoxCircularBuffer {

    private int size;
    private boolean[] cells;
    private int currentCell = 0;
    private static final int randomSizeUpperBound = 10000;
    private static final Random randomGenerator = new Random();

    /**
     * This constructor is used for unit tests only. In order to compare actual
     * size (calculated with our method
     * @see task3.Counter#countCells(task3.BlackBoxCircularBuffer)) and expected
     * @param size
     */
    public BlackBoxExposed(int size) {
        this.size = size;
        initCellsRand();
    }

    public BlackBoxExposed() {
        intitSizeRand();
        initCellsRand();
    }

    /**
     * Initialize buffer's size with random number
     */
    private void intitSizeRand() {
        size = Math.abs(randomGenerator.nextInt(randomSizeUpperBound));
        if (size == 0) {
            size++;
        }
    }

    /**
     * Initialize all buffer's cells with random boolean 
     */
    private void initCellsRand() {
        cells = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (randomGenerator.nextInt(2) == 1) {
                cells[i] = true;
            } else {
                cells[i] = false;
            }
        }
    }

    @Override
    public void shiftPositionToRight() {
        currentCell++;
        if (currentCell == size) {
            currentCell = 0;
        }
    }

    @Override
    public void shiftPositionToLeft() {
        currentCell--;
        if (currentCell == -1) {
            currentCell = size - 1;
        }
    }

    @Override
    public boolean getCurrent() {
        return cells[currentCell];
    }

    @Override
    public void setCurrent(boolean newValue) {
        cells[currentCell] = newValue;
    }
}
