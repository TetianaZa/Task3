package task3;

/**
 *
 * @author tacita
 */
interface BlackBoxCircularBuffer {

    public void shiftPositionToRight();

    public void shiftPositionToLeft();

    public boolean getCurrent();

    public void setCurrent(boolean newValue);
}
