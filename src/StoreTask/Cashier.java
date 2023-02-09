package StoreTask;

public class Cashier extends Staff {

    private boolean isFired;

    public Cashier(String storeName, String name, String staffID, boolean isFired) {
        super(storeName, name, staffID);
        this.isFired = isFired;
    }

    public boolean isFired() {
        return isFired;
    }

    public void setFired(boolean fired) {
        isFired = fired;
    }
}
