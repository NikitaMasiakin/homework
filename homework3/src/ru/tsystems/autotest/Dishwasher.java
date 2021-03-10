package ru.tsystems.autotest;

public class Dishwasher {

    private int maxQuantity;
    private int quantity;
    private Status status;

    /**
     * @param maxQuantity
     * Maximum quantity of dishes, natural number.
     * @throws IllegalArgumentException
     */
    public void DishWasher(int maxQuantity) {
        if (maxQuantity <= 0) {
            throw new IllegalArgumentException("Quantity should be a natural number.");
        }
        this.maxQuantity = maxQuantity;
    }

    /**
     * Add one dish. Quantity variable increases.
     * @throws DishWasherWrongStateException
     */
    public void add() throws DishWasherWrongStateException {
        if (status.equals(Status.on)) {
            throw new DishWasherWrongStateException("Dishwasher is on, adding impossible.");
        } else if (quantity >= maxQuantity)
            throw new DishWasherWrongStateException("Dishwasher is full.");
        quantity++;
    }

    /**
     * Remove all dishes. Quantity variable is set to 0.
     * @throws DishWasherWrongStateException
     */
    public void remove() throws DishWasherWrongStateException {
        if (status.equals(Status.on)) throw new DishWasherWrongStateException("Dishwasher is on, removing impossible.");
        else if (quantity == 0) {
            throw new DishWasherWrongStateException("Dishwasher is empty.");
        }
        this.quantity = 0;
    }

    /**
     * Start dishwasher. Status is set to on.
     * @throws DishWasherWrongStateException
     */
    public void start() throws DishWasherWrongStateException {
        if (status.equals(Status.on)) throw new DishWasherWrongStateException("Dishwasher is on.");
        status = Status.on;
    }

    /**
     * Stop dishwasher. Status is set to off.
     * @throws DishWasherWrongStateException
     */
    public void stop() throws DishWasherWrongStateException {
        if (status.equals(Status.off)) throw new DishWasherWrongStateException("Dishwasher is off.");
        status = Status.off;
    }
}
